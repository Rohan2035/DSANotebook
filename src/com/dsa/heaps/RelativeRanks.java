package com.dsa.heaps;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {

    public static String[] solution(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        String[] res = new String[arr.length];

        // Use priority queue instead of an Array
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i ++) map.put(arr[i], arr.length - i);

        for(int i = 0; i < arr.length; i ++) {

            int index = map.get(temp[i]);
            if(index == 1) res[i] = "Gold Medal";
            else if(index == 2) res[i] = "Silver Medal";
            else if(index == 3) res[i] = "Bronze Medal";
            else res[i] = String.valueOf(index);

        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 1, 5, 2};
        String[] res = solution(arr);

        for(String st : res) System.out.print(st + " ");
        System.out.println();

    }

}
