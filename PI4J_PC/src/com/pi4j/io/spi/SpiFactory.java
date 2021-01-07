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
public class SpiFactory {

    public static SpiDevice getInstance ( int channel, int speed, int mode ) throws IOException {
        return( new SpiDevice() );
    }

}
