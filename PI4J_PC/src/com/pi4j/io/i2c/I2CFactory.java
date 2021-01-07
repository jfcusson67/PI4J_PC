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
public class I2CFactory {
    public static I2CBus getInstance(int bus)throws IOException, UnsupportedBusNumberException {
        return( new I2CBus() );
    }
    public class UnsupportedBusNumberException extends Throwable {
    }

}
