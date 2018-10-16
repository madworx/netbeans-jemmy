/*
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at http://www.netbeans.org/cddl.html
 * or http://www.netbeans.org/cddl.txt.
 *
 * When distributing Covered Code, include this CDDL Header Notice in each file
 * and include the License file at http://www.netbeans.org/cddl.txt.
 * If applicable, add the following below the CDDL Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * The Original Software is the Jemmy library.
 * The Initial Developer of the Original Software is Alexandre Iline.
 * All Rights Reserved.
 *
 * Contributor(s): Alexandre Iline.
 *
 * $Id: InternalFrameDriver.java,v 1.3 2006/06/30 14:00:34 jtulach Exp $ $Revision: 1.3 $ $Date: 2006/06/30 14:00:34 $
 *
 */

package org.netbeans.jemmy.drivers;

import java.awt.Component;

import org.netbeans.jemmy.operators.ComponentOperator;

/**
 * Defines the way to get a title pane.
 */
public interface InternalFrameDriver {
    /**
     * Returns the title pane component.
     * @param oper operator for an internal frame.
     * @return a component - title pane.
     */
    public Component getTitlePane(ComponentOperator oper);
}
