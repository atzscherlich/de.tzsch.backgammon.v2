/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tzsch.backgammon.v2.impl;

import de.tzsch.backgammon.v2.iColor;

/**
 *
 * @author arndt
 */
public class PinColor extends Color  implements iColor{

    public enum colorString {
        NONE,
        BLACK,
        WHITE
    }
    
    @Override
    public boolean equals(iColor c) {
        return c.equals(this);
    }
    
}
