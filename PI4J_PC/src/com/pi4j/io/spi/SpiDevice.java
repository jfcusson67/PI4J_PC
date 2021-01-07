/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pi4j.io.spi;

import java.io.IOException;

/**
 *
 * @author jfcusson
 */
public class SpiDevice {
public static final int DEFAULT_SPI_SPEED = 0;
public static final int DEFAULT_SPI_MODE  = 1;

    public byte[] write( byte[] data ) throws IOException {
        byte[] returnData = new byte[3];
        return( returnData );
    }
}
