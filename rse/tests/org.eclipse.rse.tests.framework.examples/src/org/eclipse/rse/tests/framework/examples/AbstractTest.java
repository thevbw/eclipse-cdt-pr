/* *******************************************************************************
 * Copyright (c) 2006 IBM Corporation. All rights reserved.
 * This program and the accompanying materials are made available under the terms
 * of the Eclipse Public License 2.0 which accompanies this distribution, and is 
 * available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 * David Dykstal (IBM) - initial contribution.
 * *******************************************************************************/
package org.eclipse.rse.tests.framework.examples;

import org.eclipse.rse.tests.framework.AnnotatingTestCase;

public class AbstractTest extends AnnotatingTestCase {

	protected void sleep(int n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
		}
	}

}


