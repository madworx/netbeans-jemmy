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
 * $Id: JTabAPIDriver.java,v 1.2 2006/06/30 14:00:37 jtulach Exp $ $Revision: 1.2 $ $Date: 2006/06/30 14:00:37 $
 *
 */

package org.netbeans.jemmy.drivers.lists;

import java.awt.Rectangle;

import javax.swing.JTabbedPane;

import org.netbeans.jemmy.JemmyException;
import org.netbeans.jemmy.QueueTool;

import org.netbeans.jemmy.drivers.DriverManager;
import org.netbeans.jemmy.drivers.LightSupportiveDriver;
import org.netbeans.jemmy.drivers.ListDriver;

import org.netbeans.jemmy.operators.ComponentOperator;
import org.netbeans.jemmy.operators.JTabbedPaneOperator;

/**
 * List driver for javax.swing.JTabbedPane component type.
 *
 * @author Alexandre Iline(alexandre.iline@sun.com)
 */
public class JTabAPIDriver extends LightSupportiveDriver implements ListDriver {
    private QueueTool queueTool;
    /**
     * Constructs a JTabMouseDriver.
     */
    public JTabAPIDriver() {
	super(new String[] {"org.netbeans.jemmy.operators.JTabbedPaneOperator"});
        queueTool = new QueueTool();
    }

    public void selectItem(final ComponentOperator oper, final int index) {
	if(index != -1) {
            queueTool.invokeSmoothly(new QueueTool.QueueAction("Choise expanding") {
                    public Object launch() {
                        ((JTabbedPaneOperator)oper).setSelectedIndex(index);
                        return(null);
                    }
                });
	}
    }
}
