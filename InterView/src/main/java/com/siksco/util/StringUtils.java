package com.siksco.util;

import java.awt.font.ImageGraphicAttribute;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kjs on 2016-09-09.
 */
public class StringUtils {
    public static boolean existChar(String s){
        Map<Character, Boolean> map = new HashMap<>();
        if(s != null){
            char[] chars = s.toCharArray();
            for(char c : chars){
                if(map.get(c) != null){
                    return true;
                }else{
                    map.put(c, true);
                }
            }
        }

        return false;
    }

    public static boolean isPermutation(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        return StringUtils.sort(s).equals(StringUtils.sort(t));
    }

    public static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean isPermutationByCount(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] letters = new int[256];

        char[] sArray = s.toCharArray();

        for(char c : sArray){
            letters[c]++;
        }

        for(int i=0; i < t.length(); i++){
            int c = (int)t.charAt(i);
            if(--letters[c] < 0){
                return false;
            }
        }

        return true;
    }
}
