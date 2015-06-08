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
public class Color implements iColor {

    public colorValue cv;
    public iColor.colorString cs;
    
    @Override
    public boolean equals(iColor c) {
        return c.equals(this);
    }
}
