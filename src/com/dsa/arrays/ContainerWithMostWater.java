package com.dsa.arrays;

public class ContainerWithMostWater {

    public static int solution(int[] heights) {

        int left = 0, right = heights.length - 1;
        int area, max = 0;

        while(left < right) {

            area = (right - left) * Math.min(heights[left], heights[right]);
            max = Math.max(max, area);

            if(heights[left] <= heights[right]) left ++;
            else right --;


        }

        return max;

    }

    public static void main(String[] args) {

        int[] heights = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max area: " + solution(heights));

    }

}
