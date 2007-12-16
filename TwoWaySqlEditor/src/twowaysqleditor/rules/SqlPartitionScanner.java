package twowaysqleditor.rules;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;

import twowaysqleditor.EditorContext;

public class SqlPartitionScanner extends RuleBasedPartitionScanner {
	public static final String SQL_IF = "__sql_if";
	public static final String SQL_ELSE = "__sql_else";
	public static final String SQL_BEGIN = "__sql_begin";
	public static final String SQL_BIND = "__sql_bind";

	public SqlPartitionScanner(EditorContext ctx) {
		IToken sqlIf = new Token(SQL_IF);
		IToken sqlElse = new Token(SQL_ELSE);
		IToken sqlBegin = new Token(SQL_BEGIN);
		IToken sqlBind = new Token(SQL_BIND);

		IPredicateRule[] rules = { new SingleLineRule("/*IF", "*/", sqlIf),
				new SingleLineRule("--ELSE", "", sqlElse),
				new BeginRule(sqlBegin), new BindRule(sqlBind) };

		setPredicateRules(rules);
	}
}
