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
 * $Id: NavigationKey.java,v 1.2 2006/06/30 14:00:40 jtulach Exp $ $Revision: 1.2 $ $Date: 2006/06/30 14:00:40 $
 *
 */

package org.netbeans.jemmy.drivers.text;

abstract class NavigationKey {
    private int keyCode;
    private int mods;
    public NavigationKey(int keyCode, int mods) {
	this.keyCode = keyCode;
	this.mods = mods;
    }
    public int getKeyCode() {
	return(keyCode);
    }
    public int getModifiers() {
	return(mods);
    }
    public abstract int getDirection();
}
