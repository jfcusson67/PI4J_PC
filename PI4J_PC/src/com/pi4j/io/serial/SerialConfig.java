/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pi4j.io.serial;

/**
 *
 * @author jfcusson
 */
public class SerialConfig {
    public int    baud;
    public int    dataBits;
    public int    parity;
    public int    stopBits;
    public int    flowControl;
    //public String device;

    public SerialConfig device( String s ) { return( this ); }
    public SerialConfig baud( int rate ) { return( this ); }
    public SerialConfig dataBits( int nBits ) { return( this ); }
    public SerialConfig parity( int p ) { return( this ); }
    public SerialConfig stopBits( int n ) { return( this ); }
    public SerialConfig flowControl( int fctrl ) { return( this ); }
}
