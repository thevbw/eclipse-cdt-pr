/*******************************************************************************
 * Copyright (c) 2008 Wind River Systems, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Radoslav Gerganov - derived from ISshService
 *******************************************************************************/
package org.eclipse.rse.internal.services.wince;

/** 
 * Markup Interface for services using the <code>WinCEConnectorService</code>.
 *
 * By implementing this interface, services can be recognized
 * as operating against an <code>WinCEConnectorService</code>. 
 * The interface is used as the key in a table for looking up the connector
 * service when needed.
 */
public interface IWinCEService {

}
