package com.siksco.util;

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
}
