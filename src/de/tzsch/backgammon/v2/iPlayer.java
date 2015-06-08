/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tzsch.backgammon.v2;

/**
 *
 * @author arndt
 */
public interface iPlayer {
    
    public String getName();
    public void setName(String name);
    public boolean aiEnabled();
    public void enableAI(boolean enable);
    public iColor getColor();
    public void setColor(iColor.colorValue color);
    public boolean isActive();
    public void play();
}
