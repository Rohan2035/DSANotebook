package com.dsa.arrays;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static int[] solution(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<>();
        for (Integer n : nums2) set2.add(n);

        set1.retainAll(set2);

        int [] output = new int[set1.size()];
        int idx = 0;
        for (int s : set1) output[idx++] = s;
        return output;


    }

    public static void main(String[] args) {

        int[] sol = solution(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        for(int i : sol)
            System.out.println(i);

    }

}
