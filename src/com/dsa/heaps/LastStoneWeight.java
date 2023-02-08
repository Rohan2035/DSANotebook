package com.dsa.heaps;

import java.util.PriorityQueue;

public class LastStoneWeight {

    public static int solution(int[] arr) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        for(Integer i : arr) pq.add(i);

        while(pq.size() > 1) {

            int num1 = pq.poll();
            int num2 = pq.poll();
            pq.offer(num1 - num2);

        }

        return pq.poll();

    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{2,7,4,1,8,1}));

    }

}
