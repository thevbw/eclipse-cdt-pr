/********************************************************************************
 * Copyright (c) 2007, 2008 IBM Corporation. All rights reserved.
 * This program and the accompanying materials are made available under the terms
 * of the Eclipse Public License 2.0 which accompanies this distribution, and is 
 * available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Initial Contributors:
 * The following IBM employees contributed to the Remote System Explorer
 * component that contains this file: David McKnight.
 * 
 * Contributors:
 * David Dykstal (IBM) - [226561] Add API markup to RSE javadocs for extend / implement
 ********************************************************************************/
package org.eclipse.rse.core.model;

import org.eclipse.core.runtime.IStatus;

/**
 * Implement this class to create callbacks.
 */
public interface IRSECallback {

	public void done(IStatus status, Object result);
}
