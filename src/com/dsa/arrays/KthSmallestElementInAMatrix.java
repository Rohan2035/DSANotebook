package com.dsa.arrays;

public class KthSmallestElementInAMatrix {

    public static int solution(int[][] arr, int k) {

        int m = arr.length;
        int start = arr[0][0];
        int end = arr[m - 1][m - 1];
        int midVal;

        while(start <= end) {

            midVal = start + (end - start) / 2;

            int ans = 0;

            for (int[] ints : arr) {

                int low = 0, high = m - 1, mid;

                while (low <= high) {

                    mid = low + (high - low) / 2;

                    if (ints[mid] <= midVal) low = mid + 1;
                    else high = mid - 1;

                }

                ans += low;

            }

            if(ans < k) start = midVal + 1;
            else end = midVal - 1;

        }

        return start;

    }


    public static void main(String[] args) {

        int[][] arr = {

                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}

        };

        System.out.println(solution(arr, 8));

    }

}
