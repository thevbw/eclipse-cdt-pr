/********************************************************************************
 * Copyright (c) 2008 IBM Corporation. All rights reserved.
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
 * David McKnight   (IBM)        - [225506] [api][breaking] RSE UI leaks non-API types
 ********************************************************************************/
package org.eclipse.rse.ui.view;

import org.eclipse.ui.views.properties.IPropertyDescriptor;

/**
 * @since 3.0
 */
public interface ISystemTableViewColumnManager {

	public IPropertyDescriptor[] getVisibleDescriptors(ISystemViewElementAdapter adapter);

	public void setCustomDescriptors(ISystemViewElementAdapter adapter, IPropertyDescriptor[] descriptors);
}
