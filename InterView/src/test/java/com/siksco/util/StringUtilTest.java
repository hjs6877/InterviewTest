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

    /**
     * 순열인지 테스트.
     */
    @Test
    public void isPermutationTest(){
        String s = "abcdef";
        String t = "bacfed";

        boolean result = StringUtils.isPermutation(s, t);

        assertEquals(true, result);
    }

    @Test
    public void isPermutationByCountTest(){
        String s = "abcdefg";
        String t = "fgadbce";

        assertEquals(true, StringUtils.isPermutationByCount(s, t));
    }
}
