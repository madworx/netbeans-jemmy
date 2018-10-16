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
 * $Id: PNGImageLoader.java,v 1.2 2006/06/30 14:00:42 jtulach Exp $ $Revision: 1.2 $ $Date: 2006/06/30 14:00:42 $
 *
 */

package org.netbeans.jemmy.image;

import java.awt.image.BufferedImage;

import java.io.FileInputStream;
import java.io.IOException;

import org.netbeans.jemmy.util.PNGDecoder;

/**
 * Allowes to process PNF image format.
 *
 * @author Alexandre Iline (alexandre.iline@sun.com)
 */
public class PNGImageLoader implements ImageLoader {

    /**
     * Loads an image from a PNG image file.
     */
    public BufferedImage load(String fileName) throws IOException {
        return(new PNGDecoder(new FileInputStream(fileName)).decode());
    }
}
