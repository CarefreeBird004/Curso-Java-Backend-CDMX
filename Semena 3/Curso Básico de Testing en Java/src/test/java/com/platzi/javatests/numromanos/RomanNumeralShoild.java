package com.platzi.javatests.numromanos;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralShoild {

    @Test
    public void numero_1(){
        assertThat(RomanNumeral.arabicToRoman(1),is("I"));
    }
    @Test
    public void numero_2(){
        assertThat(RomanNumeral.arabicToRoman(2),is("II"));
    }
    @Test
    public void numero_5(){
        assertThat(RomanNumeral.arabicToRoman(5),is("V"));
    }
    @Test
    public void numero_8(){
        assertThat(RomanNumeral.arabicToRoman(8),is("VIII"));
    }

}