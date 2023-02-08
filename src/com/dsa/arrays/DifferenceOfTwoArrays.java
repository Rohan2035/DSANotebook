package com.dsa.arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class DifferenceOfTwoArrays {

    public static List<List <Integer>> solution(int[] nums1, int[] nums2) {

        List<List<Integer>> res = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int n : nums1) set1.add(n);
        for(int n : nums2) set2.add(n);

        List<Integer> sub = new ArrayList<>();
        List<Integer> sub2 = new ArrayList<>();

        for(int i : set1) if(!set2.contains(i)) sub.add(i);
        for(int i : set2) if(!set1.contains(i)) sub2.add(i);

        res.add(sub);
        res.add(sub2);

        return res;

    }

    public static void main(String[] args) {

        List<List<Integer>> sol = solution(new int[]{1,2,3}, new int[]{2,4,6});
        System.out.println(sol);

    }

}
