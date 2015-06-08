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
public class FieldStatus {
    public PointColor.colorValue fieldColor;
    public int position;
    public int pinCount;
    public PinColor.colorValue pinColor;
    
    public boolean validate() {
        assert fieldColor != null : "Feld ist noch nicht initalisiert: " + this.toString();
        assert pinColor != null : "Stein ist noch nicht initalisiert: " + this.toString();
        assert pinCount >= 0 : "Anzahl Steine darf nicht negativ sein: " + this.toString();
        if(pinCount == 0)
            assert pinColor == iColor.colorValue.EMPTY : "Auf einem leeren Feld darf keine Steinfarbe gesetzt sein: " + this.toString();
        else
            assert pinColor != iColor.colorValue.EMPTY : "Auf einem besetzten Feld muss die Steinfarbe gesetzt sein: " + this.toString();
        
        return true;
    }
    
    @Override
    public String toString() {
        return position
                + " - " + fieldColor.toString()
                + " - " + pinCount
                + " - " + pinColor.toString();
    }
}
