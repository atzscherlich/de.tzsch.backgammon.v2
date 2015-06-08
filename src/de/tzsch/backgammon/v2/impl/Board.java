/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tzsch.backgammon.v2.impl;

import de.tzsch.backgammon.v2.iBoard;
import de.tzsch.backgammon.v2.iPoint;

/**
 *
 * @author arndt
 */
public class Board implements iBoard{

    private final iPoint points[];
    
    Board() {
        points = new Point[24];
    }
    
    @Override
    public void init() throws ExceptionInInitializerError{
        
        FieldStatus fs = new FieldStatus();
        
        for(int p = 0; p < 24; p++) {
           fs.position = p;
           
           if(p%2 == 0)
               fs.fieldColor = PointColor.colorValue.LIGHT;
           else
               fs.fieldColor = PointColor.colorValue.DARK;
           
           switch (p)
           {
                case 0:     fs.pinCount = 2;
                            fs.pinColor = PinColor.colorValue.DARK;
                            break; 
                case 5:     fs.pinCount = 5;
                            fs.pinColor = PinColor.colorValue.LIGHT;
                            break;
                case 7:     fs.pinCount = 3;
                            fs.pinColor = PinColor.colorValue.LIGHT;
                            break;
                case 11:    fs.pinCount = 5;
                            fs.pinColor = PinColor.colorValue.DARK;
                            break;
                case 12:    fs.pinCount = 5;
                            fs.pinColor = PinColor.colorValue.LIGHT;
                            break;
                case 16:    fs.pinCount = 3;
                            fs.pinColor = PinColor.colorValue.DARK;
                            break;
                case 18:    fs.pinCount = 5;
                            fs.pinColor = PinColor.colorValue.DARK;
                            break;
                case 23:    fs.pinCount = 2;
                            fs.pinColor = PinColor.colorValue.LIGHT;
                            break;
               default:     fs.pinCount = 0;
                            fs.pinColor = PinColor.colorValue.EMPTY;
           }
           if(fs.validate())
                points[p] = new Point(fs);
           else
               throw new ExceptionInInitializerError("Error setting up Board");
        }
    }

    @Override
    public FieldStatus getFieldStatus(int position) {
        return points[position].getFieldStatus();
    }
    
}
