/********************************************************************************
 * Copyright (c) 2006 IBM Corporation. All rights reserved.
 * This program and the accompanying materials are made available under the terms
 * of the Eclipse Public License v1.0 which accompanies this distribution, and is 
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial Contributors:
 * The following IBM employees contributed to the Remote System Explorer
 * component that contains this file: David McKnight, Kushal Munir, 
 * Michael Berger, David Dykstal, Phil Coulthard, Don Yantzi, Eric Simpson, 
 * Emily Bruner, Mazen Faraj, Adrian Storisteanu, Li Ding, and Kent Hawley.
 * 
 * Contributors:
 * David McKnight     (IBM)    - [227406][api][dstore] need apis for getting buffer size in IDataStoreProvider
 ********************************************************************************/

package org.eclipse.dstore.core.model;


public interface IDataStoreProvider
{
	public DataStore getDataStore();
	
	/**
	 * Returns the upload buffer size preference.  To be used by Dstore 
	 * services to determine buffer size when uploading.
	 * 
	 * @since 3.0
	 */
	public int getBufferUploadSize();
	
	/**
	 * Returns the download buffer size preference.  To be used by
	 * Dstore services to determine buffer size when downloading.
	 * 
	 * @since 3.0
	 */
	public int getBufferDownloadSize();
	
}