/*******************************************************************************
 * Copyright (c) 2006, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
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
 * {Name} (company) - description of contribution.
 *******************************************************************************/

package org.eclipse.rse.subsystems.files.core.subsystems;

public interface IRemoteSearchConstants {
	
	/**
	 * Status indicating configuration is still running, 0.
	 */
	public static final int RUNNING = 0;
   
	/**
	 * Status indicating configuration has finished, 1.
	 */
	public static final int FINISHED = 1;
   
	/**
	 * Status indicating configuration has been cancelled, 2.
	 */
	public static final int CANCELLED = 2;
   
	/**
	 * Status indicating configuration has been disconnected, 3.
	 */
	public static final int DISCONNECTED = 3;
}
