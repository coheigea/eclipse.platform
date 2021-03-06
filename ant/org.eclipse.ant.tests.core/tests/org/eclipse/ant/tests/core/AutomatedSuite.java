/*******************************************************************************
 * Copyright (c) 2000, 2011 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ant.tests.core;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.ant.tests.core.tests.FrameworkTests;
import org.eclipse.ant.tests.core.tests.OptionTests;
import org.eclipse.ant.tests.core.tests.ProjectTests;
import org.eclipse.ant.tests.core.tests.PropertyTests;
import org.eclipse.ant.tests.core.tests.TargetTests;
import org.eclipse.ant.tests.core.tests.TaskTests;
import org.eclipse.ant.tests.core.tests.TypeTests;

/**
 * Test the Eclipse Ant Core.
 * 
 * To run this test suite:
 * <ol>
 * <li>Create a new JUnit plugin test launch configuration</li>
 * <li>Set the Test class to "org.eclipse.ant.tests.core.AutomatedSuite"</li>
 * <li>Set the Project to "org.eclipse.ant.tests.core"</li>
 * <li>Run the launch configuration. Output from the tests will be displayed in a JUnit view</li>
 * </ol>
 */
public class AutomatedSuite extends TestSuite {

	/**
	 * Returns the suite. This is required to use the JUnit Launcher.
	 */
	public static Test suite() {
		return new AutomatedSuite();
	}

	/**
	 * Construct the test suite.
	 */
	public AutomatedSuite() {
		addTest(new TestSuite(FrameworkTests.class));
		addTest(new TestSuite(TargetTests.class));
		addTest(new TestSuite(ProjectTests.class));
		addTest(new TestSuite(OptionTests.class));
		addTest(new TestSuite(TaskTests.class));
		addTest(new TestSuite(TypeTests.class));
		addTest(new TestSuite(PropertyTests.class));
	}
}