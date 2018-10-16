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
 * $Id: ComponentChooser.java,v 1.3 2006/06/30 14:00:30 jtulach Exp $ $Revision: 1.3 $ $Date: 2006/06/30 14:00:30 $
 *
 */

package org.netbeans.jemmy;

import java.awt.Component;

/**
 *
 * This interface should be implemented to define the criteria
 * used to search for a component.
 * @see org.netbeans.jemmy.ComponentSearcher
 * @see org.netbeans.jemmy.WindowWaiter
 *
 * @author Alexandre Iline (alexandre.iline@sun.com)
 */

public interface ComponentChooser {
    /**
     * Check if the component argument meets the search criteria.
     * @param comp Component to check.
     * @return <code>true</code> when the component conforms to
     * the search criteria; <code>false</code> otherwise.
     */
    public boolean checkComponent(Component comp);

    /**
     * Returns searched component description.
     * @return a String representing the description value
     */
    public String getDescription();
}
