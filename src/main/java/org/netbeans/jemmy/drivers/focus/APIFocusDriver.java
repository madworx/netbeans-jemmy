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
 * $Id: APIFocusDriver.java,v 1.3 2006/06/30 14:00:36 jtulach Exp $ $Revision: 1.3 $ $Date: 2006/06/30 14:00:36 $
 *
 */

package org.netbeans.jemmy.drivers.focus;

import java.awt.event.FocusEvent;

import org.netbeans.jemmy.drivers.FocusDriver;
import org.netbeans.jemmy.drivers.LightSupportiveDriver;

import org.netbeans.jemmy.drivers.input.EventDriver;

import org.netbeans.jemmy.operators.ComponentOperator;

public class APIFocusDriver extends LightSupportiveDriver implements FocusDriver {
    EventDriver eDriver;
    public APIFocusDriver() {
	super(new String[] {"org.netbeans.jemmy.operators.ComponentOperator"});
	eDriver = new EventDriver();
    }
    public void giveFocus(ComponentOperator operator) {
	operator.requestFocus();
	eDriver.dispatchEvent(operator.getSource(),
			      new FocusEvent(operator.getSource(),
					     FocusEvent.FOCUS_GAINED));
    }
}
