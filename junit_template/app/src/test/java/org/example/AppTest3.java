/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.*;
import static org.junit.Assert.*;

public class AppTest3{
    private Game g;

    public AppTest3(){
        this.g = new Game();
        this.g.load();
    }

    @Test
    public void testPlayer1(){
        String result = this.g.roll(0, 3);
        assertEquals("R",result);
        Player p = this.g.getPlayer(0);
        assertEquals(6,p.getRollCount());
    }
    @Test
    public void testPlayer2(){
        String result = this.g.roll(0, 4);
        assertEquals("SR",result);
        Player p = this.g.getPlayer(0);
        assertEquals(6,p.getRollCount());
    }
    @Test
    public void testPlayer3(){
        String result = this.g.roll(0, 5);
        assertEquals("SSR",result);
        Player p = this.g.getPlayer(0);
        assertEquals(6,p.getRollCount());
    }

    @Before
    public void setUp(){

        //Hardcode nilai rollCount menjadi 5 untuk menyamakan 
        this.g.getPlayer(0).setRollCount(5);
        
    }

}
