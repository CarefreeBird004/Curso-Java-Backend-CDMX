package com.platzi.javatests.payments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    private String string;
    @Before
    public void setup(){
        string = "Hola";
    }
    @Test
    public void string_not_empty(){
        assertFalse(StringUtil.isEmpty("Holiii"));
    }
}