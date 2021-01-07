/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pi4j.io.serial;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *
 * @author jfcusson
 */
public class Serial {
    public void open( SerialConfig serialConfig ) throws IOException {}
    public void write( byte[] b ) throws IOException {}
    public byte[] read( int n ) throws IOException {return(null);}
    public byte[] read( int n, ByteArrayOutputStream b ) {return(null);}
    public void discardData() throws IOException {}
    public int available() throws IOException {return(0);}
}
