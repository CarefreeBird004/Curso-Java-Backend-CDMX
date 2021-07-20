package com.platzi.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void looses_when_dice_number_is_too_low(){

        //Dice dice = new Dice(5);
        //Remplazo de linea
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player player1 =new Player(dice,3);
        assertFalse(player1.play());
    }

    @Test
    public void wins_when_dice_number_is_too_low(){

        //Dice dice = new Dice(5);
        //Remplazo de linea
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);
        Player player1 =new Player(dice,3);
        assertTrue(player1.play());
    }

}