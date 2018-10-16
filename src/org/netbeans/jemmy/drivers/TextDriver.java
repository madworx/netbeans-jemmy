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
 * $Id: TextDriver.java,v 1.5 2006/06/30 14:00:36 jtulach Exp $ $Revision: 1.5 $ $Date: 2006/06/30 14:00:36 $
 *
 */

package org.netbeans.jemmy.drivers;

import org.netbeans.jemmy.operators.ComponentOperator;

/**
 * Defines how to work with text components.
 *
 * @author Alexandre Iline (alexandre.iline@sun.com)
 */
public interface TextDriver {

    /**
     * Moves caret.
     * @param oper Text component operator.
     * @param position Position to move caret to.
     */
    public void changeCaretPosition(ComponentOperator oper, int position);

    /**
     * Selects text.
     * @param oper Text component operator.
     * @param startPosition a posistion of selction start
     * @param finalPosition a posistion of selction end
     */
    public void selectText(ComponentOperator oper, int startPosition, int finalPosition);

    /**
     * Clears component text.
     * @param oper Text component operator.
     */
    public void clearText(ComponentOperator oper);

    /**
     * Types new text.
     * @param oper Text component operator.
     * @param text New text to type.
     * @param caretPosition Type text at that position.
     */
    public void typeText(ComponentOperator oper, String text, int caretPosition);

    /**
     * Replace component text.
     * @param oper Text component operator.
     * @param text New text to type.
     */
    public void changeText(ComponentOperator oper, String text);

    /**
     * Type text and push enter.
     * @param oper Text component operator.
     * @param text New text to type.
     */
    public void enterText(ComponentOperator oper, String text);
}
