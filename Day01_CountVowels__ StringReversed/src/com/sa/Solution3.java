package com.sa;

import java.util.HashMap;
import java.util.Map;

public class Solution3{
    public static void main(String[] args) {

        String input = "java";

       
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
              
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
