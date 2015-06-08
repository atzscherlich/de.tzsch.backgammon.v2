/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tzsch.backgammon.v2.impl;

import de.tzsch.backgammon.v2.iBoard;
import de.tzsch.backgammon.v2.iGame;
import de.tzsch.backgammon.v2.iPlayer;

/**
 *
 * @author arndt
 */
public class Game implements iGame{

    protected iBoard board;
    protected iPlayer players[];
    
    public Game(){
        setup();
    }
    
    @Override
    public void setup() {
        try {
            board = new Board();
            board.init();
        }
        catch (Exception e)
        {
            System.out.println("Error on initializing board");
        }
        try {
            players = new Player[2];
            
            iPlayer p = new Player();
            p.setName("Player 1");
            p.setColor(PlayerColor.colorValue.LIGHT);
            p.enableAI(true);
            
            players[0] = p;
            
            p.setName("Player 2");
            p.setColor(PlayerColor.colorValue.LIGHT);
            p.enableAI(true);
            
            players[1] = p;
            
            assert players[0].getName() != players[1].getName() : "Player names must be different";
            assert players[0].getColor()!= players[1].getColor(): "Player colors must be different";
        }
        catch (Exception e)
        {
            System.out.println("Error on initializing players");
        }
        
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
