package com.platzi.javatests.util;
import com.platzi.javatests.util.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat_string_one(){
        Assert.assertEquals(StringUtil.repeat("hola", 1), "hola");
    }
    @Test
    public void testRepeat_multiple_times(){
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola", 3),"holaholahola");

    }
    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola", -1);
    }
}