package com.dsa.strings;

import java.util.HashSet;

public class LengthOfLongestSubstring {

    public static int solution(String s) {

        if(s.isEmpty()) return 0;
        if(s.length() == 1) return 1;

        int left = 0, res = 0;
        HashSet<Character> charSet = new HashSet<>();

        for(int right = 0; right < s.length(); right ++) {

            while(charSet.contains(s.charAt(right))) {

                charSet.remove(s.charAt(left));
                left ++;

            }

            charSet.add(s.charAt(right));
            res = Math.max(res, right - left + 1);

        }

        return res;

    }

    public static void main(String[] args) {

        System.out.println("Length of longest substring: " + solution("abcabcbb"));

    }

}
