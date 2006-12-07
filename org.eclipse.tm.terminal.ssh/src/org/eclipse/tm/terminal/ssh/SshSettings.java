/*******************************************************************************
 * Copyright (c) 2006 Wind River Systems, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Scharf (Wind River) - initial implementation
 *     
 *******************************************************************************/
package org.eclipse.tm.terminal.ssh;

import org.eclipse.tm.terminal.ISettingsStore;

public class SshSettings implements ISshSettings {
    protected String fHost;
    protected String fUser;
    protected String fPassword;
    protected String fPort;
    protected String fTimeout;
	public String getHost() {
		return fHost;
	}

	public void setHost(String strHost) {
		fHost = strHost;
	}

	public String getStatusString(String strConnected) {
		return " (" + //$NON-NLS-1$
			getHost() + ":" + //$NON-NLS-1$
			getUser() + " - " + //$NON-NLS-1$
			strConnected + ")"; //$NON-NLS-1$
	}

	public void load(ISettingsStore store) {
		fHost = store.get("Host");//$NON-NLS-1$
		fUser = store.get("User");//$NON-NLS-1$
		fPort = store.get("Port");//$NON-NLS-1$
		fTimeout = store.get("Timeout");//$NON-NLS-1$
	}


	public void save(ISettingsStore store) {
		store.put("Host", fHost);//$NON-NLS-1$
		store.put("User", fUser);//$NON-NLS-1$
		store.put("Port", fPort);//$NON-NLS-1$
		store.put("Timeout", fTimeout);//$NON-NLS-1$
	}


	public int getTimeout() {
		try {
			return Integer.parseInt(fTimeout);
		} catch (NumberFormatException numberFormatException) {
			return 10;
		}
	}
	public String getTimeoutString() {
		return fTimeout;
	}

	public void setTimeout(String timeout) {
		fTimeout = timeout;
	}

	public String getUser() {
		return fUser;
	}

	public void setUser(String user) {
		fUser = user;
	}
	public int getPort() {
		try {
			return Integer.parseInt(fPort);
		} catch (NumberFormatException numberFormatException) {
			return 22;
		}
	}

	public String getPortString() {
		return fPort;
	}

	public void setPort(String port) {
		fPort = port;
	}

	public String getPassword() {
		return fPassword;
	}

	public void setPassword(String password) {
		fPassword = password;
	}
}
