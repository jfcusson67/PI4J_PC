/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pi4j.io.i2c;

import java.io.IOException;

/**
 *
 * @author jfcusson
 */
public class I2CBus {
    public static final int BUS_1 = 1;
    public static I2CDevice getDevice( int addr ) throws IOException {
        return( new I2CDevice() );
    }

}
