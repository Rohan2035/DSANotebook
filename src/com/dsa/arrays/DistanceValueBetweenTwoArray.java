package com.dsa.arrays;

import java.util.Arrays;

public class DistanceValueBetweenTwoArray {

    public static int solution(int[] arr1, int[] arr2, int d) {

        Arrays.sort(arr2);
        boolean flag;
        int count = 0;

        for (int value : arr1) {

            flag = false;

            int val = Arrays.binarySearch(arr2, 0, arr2.length, value);
            if (val < 0) val = -(val + 1);
            if (val < arr2.length && Math.abs(arr2[val] - value) <= d) flag = true;
            if (val != 0 && Math.abs(arr2[val - 1] - value) <= d) flag = true;
            if (!flag) count++;

        }

        return count;

    }

    public static void main(String[] args) {

        int res = solution(new int[]{1,4,2,3}, new int[]{-4,-3,6,10,20,30}, 3);
        System.out.println(res);

    }

}
