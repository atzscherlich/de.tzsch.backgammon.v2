/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tzsch.backgammon.v2;

import de.tzsch.backgammon.v2.impl.PinColor;

/**
 *
 * @author arndt
 */
public interface iColor {
    public enum colorString{};
    public enum colorValue {
        EMPTY,
        DARK,
        LIGHT
    }

    @Override
    public String toString();
    public boolean equals(iColor c);
}
