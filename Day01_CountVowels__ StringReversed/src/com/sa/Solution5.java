package com.sa;

import java.util.HashMap;
import java.util.Map;

public class Solution5 {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

      
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

       
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

 
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

       
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        
        if (map1.equals(map2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
