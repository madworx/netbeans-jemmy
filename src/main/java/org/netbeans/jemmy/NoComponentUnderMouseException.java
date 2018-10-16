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
 * $Id: NoComponentUnderMouseException.java,v 1.2 2006/06/30 14:00:31 jtulach Exp $ $Revision: 1.2 $ $Date: 2006/06/30 14:00:31 $
 *
 */

package org.netbeans.jemmy;

import java.awt.Component;

/**
 *
 * Exception can be throwht as a result of attempt to produce a mouse pressing
 * when mouse is not over the java component.
 *
 * @author Alexandre Iline (alexandre.iline@sun.com)
 */

public class NoComponentUnderMouseException extends RuntimeException {
    /**
     * Constructor.
     */
    public NoComponentUnderMouseException() {
	super("No component under the mouse!");
    }

}
