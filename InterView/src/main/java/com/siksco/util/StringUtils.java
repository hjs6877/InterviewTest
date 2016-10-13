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

    public static String replaceSpaceToOther(String s){
        int i = 0;
        int count = 0;

        char[] sArray = s.toCharArray();

        for(int j = 0; j < sArray.length; j++){
            if(sArray[j] == ' '){
                count++;
            }
        }
        char[] tArray = new char[sArray.length + (count * 3)];

        for(int k = 0; k < sArray.length; k++){
            if(sArray[k] == ' '){
                tArray[i++] = '%';
                tArray[i++] = '2';
                tArray[i++] = '0';
            }else{
                tArray[i++] = sArray[k];
            }
        }
        return new String(tArray).trim();
    }

    public static String compressString(String s){
        String t = "";
        char now = 0;
        char prev = 0;
        int count = 0;
        char[] sArray = s.toCharArray();

        for(int i=0; i < sArray.length; i++){
            now = sArray[i];

            if(prev == 0){
                prev = now;
                count = 1;
            }else if(now == prev){
                count++;
            }else if(now != prev){
                String compressWord = String.valueOf(prev) + Integer.toString(count);
                t += compressWord;
                prev = now;
                count = 1;
            }

            if(i == sArray.length -1){
                String compressWord = String.valueOf(prev) + Integer.toString(count);
                t += compressWord;
            }
        }

        if(t.length() >= s.length()){
            return s;
        }
        return t;
    }
}
