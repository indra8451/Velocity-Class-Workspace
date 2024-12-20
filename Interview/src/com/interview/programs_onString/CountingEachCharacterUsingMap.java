package com.interview.programs_onString;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountingEachCharacterUsingMap {

    public static void main(String[] args) {

        String str = "Hrushikesh";
        Map<Character, Integer> chcountMap =new LinkedHashMap<>();

        int length = str.length();

        for (int i = 0; i < length; i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (chcountMap.containsKey(ch)) {
                
                chcountMap.put(ch, chcountMap.get(ch) + 1);
            } else {
            
                chcountMap.put(ch, 1);
            }

        }

        System.out.println(chcountMap);

    }

}
