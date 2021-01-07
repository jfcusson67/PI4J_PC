/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pi4j.io.gpio;

/**
 *
 * @author JFCusson
 */
public class GpioFactory {

    public static GpioController getInstance() {
        return( new GpioController() );
    }

}
