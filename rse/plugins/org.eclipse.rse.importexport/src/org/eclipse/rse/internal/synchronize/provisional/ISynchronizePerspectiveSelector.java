/*******************************************************************************
 * Copyright (c) 2008, 2009 Takuya Miyamoto and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Takuya Miyamoto - initial API and implementation
 *******************************************************************************/
package org.eclipse.rse.internal.synchronize.provisional;

import java.util.List;

import org.eclipse.core.resources.IResource;

/**
 * 
 * Switch to the team synchronization perspective
 * 
 */
public interface ISynchronizePerspectiveSelector {

	/**
	 * Open synchronize perspective
	 * 
	 * @param synchronizeElement
	 */
	public void openSynchronizePerspective(List<IResource> synchronizeElement);
}
