/*******************************************************************************
 * Copyright (c) 2012 Ericsson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Marc Khouzam (Ericsson) - initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.dsf.gdb.service.command;

import org.eclipse.cdt.dsf.concurrent.RequestMonitor;
import org.eclipse.cdt.dsf.mi.service.command.CommandFactory;
import org.eclipse.cdt.dsf.service.DsfSession;
import org.eclipse.debug.core.ILaunchConfiguration;

/**
 * With GDB 7.4, the command 'maintenance set python print-stack' is not supported.
 * The new command "set python print-stack none|full|message" has replaced it, with
 * the default being 'message'.  With this new default 
 * @since 4.1
 */
public class GDBControl_7_4 extends GDBControl_7_2 implements IGDBControl {
    public GDBControl_7_4(DsfSession session, ILaunchConfiguration config, CommandFactory factory) {
    	super(session, config, factory);
    	setUseThreadGroupOptions(true);
    }
    
	@Override
	public void setPrintPythonErrors(boolean enabled, RequestMonitor rm) {
		// With GDB 7.4, the command 'maintenance set python print-stack' is not supported.
		// The new command "set python print-stack none|full|message" has replaced it, with
		// the default being 'message'.  This new default is good enough for us, so no
		// need to do anything anymore.
		// Bug 367788 
		rm.done();
	}
}
