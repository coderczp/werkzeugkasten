/*
 * Copyright 2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package werkzeugkasten.resource.synchronizer.job;

import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import werkzeugkasten.resource.synchronizer.Activator;
import werkzeugkasten.resource.synchronizer.nls.Strings;

/**
 * 
 * @author taichi
 * 
 */
public class StartServerJob extends WorkspaceJob {

	public StartServerJob() {
		super(Strings.MSG_START_SERVER);
	}

	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor)
			throws CoreException {
		monitor.beginTask(Strings.MSG_START_SERVER, 3);
		monitor.worked(1);
		try {
			Activator.startServer();
			monitor.worked(1);
			Activator.refreshToggleAction();
		} finally {
			monitor.worked(1);
			monitor.done();
		}
		return Status.OK_STATUS;
	}
}
