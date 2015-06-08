/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tzsch.backgammon.v2.impl;

import de.tzsch.backgammon.v2.iPoint;

/**
 *
 * @author arndt
 */
public class Point implements iPoint{

    FieldStatus status;
    
    Point(){
        
    }
    
    Point(FieldStatus fs){
        status = fs;
    }
    
    @Override
    public FieldStatus getFieldStatus() {
        return status;
    }
    
    public void setFieldStatus(FieldStatus fs) {
        status = fs;   
    }
    
}
