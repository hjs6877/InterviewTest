package com.siksco.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kjs on 2016-09-09.
 */
public class StringUtilTest {
    @Test
    public void existCharTest(){
        String s = "Iamaboy";

        assertEquals(true, StringUtils.existChar(s));
    }
}
