package com.dsa.arrays;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class IntersectionOfMultipleArrays {

    public static List<Integer> solution(int[][] nums) {

        Map<Integer, Integer> counts = new HashMap<>();

        for (int[] num : nums) {
            for (int digit : num) {
                counts.put(digit, counts.getOrDefault(digit, 0) + 1);
            }
        }

        int n = nums.length;
        List<Integer> res = new ArrayList<>();

        for (int key : counts.keySet()) {
            if (counts.get(key) == n) {
                res.add(key);
            }
        }

        Collections.sort(res);
        return res;

    }

    public static void main(String[] args) {

        List<Integer> res = solution(new int[][]{
            {1,2,3},
            {3,5,6}
        });

        System.out.println(res);

    }

}
