/*******************************************************************************
 * Copyright (c) 2003, 2009 IBM Corporation and others.
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
package org.eclipse.ant.internal.launching.remote.logger;

public class MessageIds {

	public final static String PROCESS_ID = "processID"; //$NON-NLS-1$
	public final static String BUILD_CANCELLED = "cancelled"; //$NON-NLS-1$
	// constants need to start greater than the Project.MSG_* constants
	public final static String TASK = "6"; //$NON-NLS-1$
	public final static String TARGET = "7"; //$NON-NLS-1$
}
