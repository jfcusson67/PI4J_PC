/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pi4j.system;

import java.io.IOException;

/**
 *
 * @author jfcusson
 */
public class SystemInfoProvider {

    public static long getMemoryTotal() throws IOException, InterruptedException {
        return( 1000L );
    }
    public static long getMemoryUsed() {
        return( 1000L );
    }
    public static long getMemoryFree() {
        return( 1000L );
    }

}
