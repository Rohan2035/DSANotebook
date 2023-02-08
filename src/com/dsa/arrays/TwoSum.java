package com.dsa.arrays;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    // HashMap approach
    public static int[] solution(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++) map.putIfAbsent(nums[i], i);

        for(int i = 0; i < nums.length; i ++) {

            int diff = target - nums[i];

            if(map.containsKey(diff)) {

                if(map.get(diff) != i) return new int[]{i, map.get(diff)};

            }

        }

        return new int[]{};

    }

    public static void main(String[] args) {

        int[] res = solution(new int[]{3,2,4}, 6);
        for(int i : res) System.out.println(i);

    }

}
