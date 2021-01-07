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
public class SystemInfoFactory {

    public static SystemInfoProvider getProvider()  {
        return( new SystemInfoProvider() );
    }

}
