package werkzeugkasten.twowaysql.editor.widget;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.dialogs.SelectionDialog;

import werkzeugkasten.common.jdt.TypeUtil;
import werkzeugkasten.common.runtime.AdaptableUtil;
import werkzeugkasten.common.util.StringUtil;
import werkzeugkasten.common.viewers.ColumnDescriptor;
import werkzeugkasten.common.viewers.TableViewerCoordinator;
import werkzeugkasten.twowaysql.Activator;
import werkzeugkasten.twowaysql.editor.TwoWaySqlEditorContainer;
import werkzeugkasten.twowaysql.editor.conf.ContextSettings;
import werkzeugkasten.twowaysql.editor.conf.ContextSettings.Var;
import werkzeugkasten.twowaysql.nls.Strings;

public class ContextPage {

	protected IProject project;
	protected TwoWaySqlEditorContainer part;
	protected IEditorSite site;

	protected Text className;
	protected Combo methods;
	protected List<String> methodSignatures;
	protected Button browse;

	protected TableViewer variables;
	protected ContextSettings settings;
	protected boolean modified;

	public ContextPage(IProject project, ContextSettings settings,
			TwoWaySqlEditorContainer part, IEditorSite site) {
		this.project = project;
		this.part = part;
		this.settings = settings;
		this.site = site;
	}

	protected IProject getProject() {
		return this.project;
	}

	public boolean modified() {
		return this.modified;
	}

	public void modified(boolean is) {
		this.modified = is;
		this.part.editorDirtyStateChanged();
	}

	protected IRunnableContext getContext() {
		return this.site.getWorkbenchWindow();
	}

	protected void setSelectedDatas(IType selected) {
		try {
			this.className.setText(selected.getFullyQualifiedName());
			this.settings.type(selected.getFullyQualifiedName());
			this.methodSignatures = new ArrayList<String>();
			IProgressMonitor monitor = this.site.getActionBars()
					.getStatusLineManager().getProgressMonitor();
			TypeUtil.walkSupertypeHierarchy(selected, monitor,
					new TypeUtil.TypeHierarchyWalker() {
						@Override
						public boolean apply(IType type, IMethod method)
								throws JavaModelException {
							String[] names = method.getParameterNames();
							String sig = Signature.toString(method
									.getSignature(), method.getElementName(),
									names, true, false);
							if (method.isConstructor() == false
									&& methodSignatures.contains(sig) == false
									&& 0 < names.length) {
								methodSignatures.add(sig);
							}
							return true;
						}
					});
			this.methods.setItems(methodSignatures
					.toArray(new String[methodSignatures.size()]));
		} catch (CoreException ex) {
			Activator.log(ex);
		}
	}

	private void doRefresh() {
		try {
			final IJavaProject javap = JavaCore.create(getProject());
			IType type = javap.findType(this.className.getText());
			if (type != null && type.exists()) {
				final String sig = this.methodSignatures.get(this.methods
						.getSelectionIndex());
				IProgressMonitor monitor = this.site.getActionBars()
						.getStatusLineManager().getProgressMonitor();
				TypeUtil.walkSupertypeHierarchy(type, monitor,
						new TypeUtil.TypeHierarchyWalker() {
							@Override
							public boolean apply(IType type, IMethod method)
									throws JavaModelException {
								String[] names = method.getParameterNames();
								String s = Signature.toString(method
										.getSignature(), method
										.getElementName(), names, true, false);
								if (s.equals(sig)) {
									settings.variables().clear();
									String[] types = Signature
											.getParameterTypes(method
													.getSignature());
									if (types.length == names.length
											&& 0 < types.length) {
										for (int i = 0, length = types.length; i < length; i++) {
											String n = names[i];
											IType t = javap.findType(Signature
													.toString(types[i])
													.replace('/', '.'));
											if (t != null && t.exists()) {
												ContextSettings.Var v = new ContextSettings.Var();
												v
														.type(t
																.getFullyQualifiedName());
												v.name(n);
												v.example("");
												settings.variables().add(v);
											}
										}
									}
									return false;
								}
								return true;
							}
						});
				this.variables.setInput(settings.variables());
				this.variables.refresh();
				this.modified(true);
			}
		} catch (CoreException ex) {
			Activator.log(ex);
		}
	}

	public Composite layout(final Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE) {
			@Override
			public boolean setFocus() {
				return browse.setFocus();
			}
		};
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);

		layoutMethodSelection(composite);
		layoutTable(composite);
		layoutModifyButtons(composite);

		fillSettings();

		return composite;
	}

	private void fillSettings() {
		try {
			String type = StringUtil.toString(this.settings.type());
			if (StringUtil.isEmpty(type) == false) {
				IJavaProject javap = JavaCore.create(getProject());
				IType t = javap.findType(type);
				if (t != null) {
					setSelectedDatas(t);
				}
				String sig = this.settings.method();
				if (StringUtil.isEmpty(sig) == false) {
					int index = this.methodSignatures.indexOf(sig);
					if (-1 < index) {
						this.methods.select(index);
					}
				}
				this.variables.setInput(this.settings.variables());
				this.variables.refresh();
			}
		} catch (CoreException ex) {
			Activator.log(ex);
		}
	}

	private void layoutTable(Composite composite) {
		this.variables = new TableViewer(composite, SWT.BORDER
				| SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL);
		Table t = this.variables.getTable();
		t.setHeaderVisible(true);
		t.setLinesVisible(true);
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.VERTICAL_ALIGN_FILL | GridData.GRAB_VERTICAL);
		data.verticalSpan = 5;
		t.setLayoutData(data);
		this.variables.setContentProvider(new ArrayContentProvider());
		List<ColumnDescriptor<ContextSettings.Var>> list = buildColumns(t);
		new TableViewerCoordinator<Var>(this.variables,
				ContextSettings.Var.class, list);
	}

	private List<ColumnDescriptor<ContextSettings.Var>> buildColumns(Table table) {
		List<ColumnDescriptor<ContextSettings.Var>> result = new ArrayList<ColumnDescriptor<Var>>();
		result.add(new TypeColumn(table));
		result.add(new VariableColumn(table));
		result.add(new ExampleColumn(table));
		return result;
	}

	private void layoutModifyButtons(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		composite.setLayout(layout);

		// メソッドからは類推出来ない変数名を登録する為のボタン
		Button add = new Button(composite, SWT.PUSH);
		add.setText(Strings.label_Add);
		add.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.VERTICAL_ALIGN_BEGINNING));
		add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IType type = selectType();
				if (type != null) {
					ContextSettings.Var var = new Var();
					var.type(type.getFullyQualifiedName());
					String name = type.getElementName();
					StringBuilder stb = new StringBuilder(name);
					stb.replace(0, 1, String.valueOf(Character.toLowerCase(name
							.charAt(0))));
					var.name(stb.toString());
					var.example("");
					settings.variables().add(var);
					variables.setInput(settings.variables());
					modified(true);
				}
			}
		});

		// 変数名を削除するボタン
		Button remove = new Button(composite, SWT.PUSH);
		remove.setText(Strings.label_Remove);
		remove.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.VERTICAL_ALIGN_BEGINNING));
		remove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = AdaptableUtil.to(variables
						.getSelection(), IStructuredSelection.class);
				if (selection != null) {
					for (Object o : selection.toList()) {
						if (o instanceof Item) {
							Item em = (Item) o;
							o = em.getData();
						}
						if (o instanceof ContextSettings.Var) {
							ContextSettings.Var var = (ContextSettings.Var) o;
							settings.variables().remove(var);
						}
					}
					variables.refresh();
				}
			}
		});

		Button clear = new Button(composite, SWT.PUSH);
		clear.setText(Strings.label_Clear);
		clear.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.VERTICAL_ALIGN_BEGINNING));
		clear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// XXX Clearの範囲は、追加したものだけでいいんじゃね？
				className.setText("");
				methods.setItems(new String[] {});
				methodSignatures.clear();
				settings.variables().clear();
				settings.type("");
				settings.method("");
				variables.setInput(settings.variables());
				variables.refresh();
				modified(true);
			}
		});
	}

	private void layoutMethodSelection(final Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 3;
		composite.setLayoutData(data);
		composite.setLayout(new GridLayout(6, false));

		Label classLabel = new Label(composite, SWT.NONE);
		classLabel.setText(Strings.label_Class);
		this.className = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		this.className.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		Label methodLabel = new Label(composite, SWT.NONE);
		methodLabel.setText(Strings.label_Method);
		this.methods = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		this.methods.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.methods.setVisibleItemCount(12);
		this.methods.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				settings.method(methods.getText());
				doRefresh();
			}
		});

		// クラスを検索するダイアログを出すBrowseボタン
		this.browse = new Button(composite, SWT.PUSH);
		browse.setText(Strings.Browse);
		data = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		browse.setLayoutData(data);
		browse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IType type = selectType();
				if (type != null) {
					setSelectedDatas(type);
				}
			}
		});

		// 選択されているクラス名とメソッド名で、変数をリフレッシュするボタン。
		Button refresh = new Button(composite, SWT.PUSH);
		refresh.setText(Strings.Refresh);
		data = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		refresh.setLayoutData(data);
		refresh.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				doRefresh();
			}
		});
	}

	protected IType selectType() {
		try {
			IProject project = getProject();
			if (project != null) {
				SelectionDialog dialog = JavaUI
						.createTypeDialog(
								this.site.getShell(),
								getContext(),
								project,
								IJavaElementSearchConstants.CONSIDER_CLASSES_AND_INTERFACES,
								false);
				if (dialog.open() == IDialogConstants.OK_ID) {
					Object[] result = dialog.getResult();
					if (result != null && 0 < result.length) {
						return AdaptableUtil.to(result[0], IType.class);
					}
				}
			}
		} catch (CoreException ex) {
			Activator.log(ex);
		}
		return null;
	}

}
