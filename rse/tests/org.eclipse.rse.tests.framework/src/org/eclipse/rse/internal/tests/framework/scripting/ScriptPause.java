/*******************************************************************************
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * David Dykstal (IBM) - initial contribution.
 *******************************************************************************/
package org.eclipse.rse.internal.tests.framework.scripting;

/**
 * A Pause step will stop and wait during interpretation
 */
public class ScriptPause extends ScriptStep {
	
	private String text;

	public ScriptPause(String text, int lineNumber) {
		super(lineNumber);
		this.text = text;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.rse.tests.framework.scripting.ScriptStep#run(org.eclipse.rse.tests.framework.scripting.ScriptContext)
	 */
	public void run(ScriptContext context) {
		context.pause(text);
	}
	
}
