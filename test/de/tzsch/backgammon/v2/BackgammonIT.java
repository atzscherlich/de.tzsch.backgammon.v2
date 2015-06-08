/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tzsch.backgammon.v2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arndt
 */
public class BackgammonIT {
    
    public BackgammonIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Backgammon.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Backgammon.main(args);
        
        assertNotNull("Irgendetwas stimmt nicht", this);
    }

    /**
     * Test of init method, of class Backgammon.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        
        try{
            Backgammon.init();
        }
        catch(Exception e)
        {
            fail("The test case is a prototype." + e.toString());
        }        
    }
    
}
