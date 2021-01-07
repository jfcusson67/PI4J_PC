/* test
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pi4j.io.gpio;

/**
 *
 * @author JFCusson
 */
public class GpioController {

    public static GpioPinDigitalOutput provisionDigitalOutputPin( int pin ) {
        return( new GpioPinDigitalOutput(pin) );
    }

    public static GpioPinDigitalOutput provisionDigitalOutputPin( int pin, int state ) {
        return( new GpioPinDigitalOutput(pin) );
    }

}
