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
 * $Id: WindowDriver.java,v 1.4 2006/06/30 14:00:36 jtulach Exp $ $Revision: 1.4 $ $Date: 2006/06/30 14:00:36 $
 *
 */

package org.netbeans.jemmy.drivers;

import org.netbeans.jemmy.operators.ComponentOperator;

/**
 * Defines how to work with windows.
 */
public interface WindowDriver {

    /**
     * Activates a window.
     * @param oper Window operator.
     */
    public void activate(ComponentOperator oper);

    /**
     * Closes a window.
     * @param oper Window operator.
     */
    public void close(ComponentOperator oper);

    /**
     * Change window location.
     * @param oper Window operator.
     * @param x New x coordinate
     * @param y New y coordinate
     */
    public void move(ComponentOperator oper, int x, int y);

    /**
     * Change window size.
     * @param oper Window operator.
     * @param width New window width.
     * @param height New window height.
     */
    public void resize(ComponentOperator oper, int width, int height);
}
