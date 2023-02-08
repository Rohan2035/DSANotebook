package com.dsa.strings;

public class LongestCommonPrefix {

    @SuppressWarnings("all")
    public static String solution(String[] strs) {

        if(strs.length == 1) return strs[0];

        boolean flag = true;
        int i = 0;
        String res;

        while(flag && i < strs[0].length()) {

            for(int j = 1; j < strs.length; j ++) {

                if(i > strs[j].length() - 1) {

                    if(i == 0) return "";
                    return strs[0].substring(0, i);

                } else if(strs[0].charAt(i) != strs[j].charAt(i)) {

                    if(i == 0) return "";
                    return strs[0].substring(0, i);


                }

            }

            i ++;

        }

        return strs[0];

    }


    public static void main(String[] args) {


        System.out.println("Longest common prefix: " + solution(new String[]{"dog","racecar","car"}));


    }

}
