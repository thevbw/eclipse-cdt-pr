/********************************************************************************
 * Copyright (c) 2004, 2007 IBM Corporation and others. All rights reserved.
 * This program and the accompanying materials are made available under the terms
 * of the Eclipse Public License 2.0 which accompanies this distribution, and is 
 * available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Initial Contributors:
 * The following IBM employees contributed to the Remote System Explorer
 * component that contains this file: David McKnight, Kushal Munir, 
 * Michael Berger, David Dykstal, Phil Coulthard, Don Yantzi, Eric Simpson, 
 * Emily Bruner, Mazen Faraj, Adrian Storisteanu, Li Ding, and Kent Hawley.
 * 
 * Contributors:
 * Martin Oberhuber (Wind River) - [168975] Move RSE Events API to Core
 ********************************************************************************/

package org.eclipse.rse.subsystems.files.core.subsystems;

import org.eclipse.rse.core.model.ISystemContentsType;

/**
 * Represents contents that are children of a container
 */
public class RemoteFileChildrenContentsType implements ISystemContentsType
{
    public static String CONTENTS_TYPE_CHILDREN = "contents_file_children"; //$NON-NLS-1$
    public static RemoteFileChildrenContentsType _instance = new RemoteFileChildrenContentsType();
    
    public static RemoteFileChildrenContentsType getInstance()
    {
        return _instance;
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.rse.ui.model.ISystemContentsType#getType()
     */
    public String getType()
    {
        return CONTENTS_TYPE_CHILDREN;    
    }

    /* (non-Javadoc)
     * @see org.eclipse.rse.ui.model.ISystemContentsType#isPersistent()
     */
    public boolean isPersistent()
    {
        return false;
    }

}