/*******************************************************************************
 * Copyright (c) 2008 Radoslav Gerganov
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Radoslav Gerganov - initial API and implementation
 *******************************************************************************/
package org.eclipse.tm.rapi.tests;

import org.eclipse.tm.rapi.IRapiDesktop;
import org.eclipse.tm.rapi.RapiException;

public class RapiDesktopTest extends RapiTestCase {
  
  protected void setUp() throws Exception {
    super.setUp();
  }

  public void testGetInstance() throws RapiException {
    desktop = IRapiDesktop.getInstance();
    assertNotNull("IRapiDesktop.getInstance() returned null", desktop);
  }
  
  public void testEnumDevices() throws RapiException {
    desktop = IRapiDesktop.getInstance();
    enumDevices = desktop.enumDevices();
    assertNotNull("IRapiDesktop.enumDevices() returned null", enumDevices);
  }
  
  protected void tearDown() throws Exception {
    super.tearDown();
  }

}
