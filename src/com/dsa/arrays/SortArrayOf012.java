package com.dsa.arrays;

public class SortArrayOf012 {

    public static void solution(int[] arr, int n) {

        int left = 0, mid = 0, right = n - 1;

        while(mid <= right) {

            if(arr[mid] == 0) {

                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;

                left ++;
                mid ++;

            } else if(arr[mid] == 1) {

                mid ++;

            } else {

                int temp = arr[right];
                arr[right] = arr[mid];
                arr[mid] = temp;

                right --;

            }

        }

        for(Integer a : arr) {

            System.out.print(a + " ");

        }

        System.out.println();


    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 1, 2, 0, 1, 1, 1, 1, 1,1, 2, 2, 2,2 ,2, 2, 0, 0, 0, 0};
        solution(arr, arr.length);

    }


}
