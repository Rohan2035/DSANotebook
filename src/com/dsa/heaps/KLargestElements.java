package com.dsa.heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KLargestElements {

    public static ArrayList<Integer> solution(ArrayList<Integer> A, int B) {

        Queue<Integer> pQ = new PriorityQueue<>();

        for(Integer num : A) {

            pQ.offer(num);

            if(pQ.size() > B) pQ.poll();

        }

        return new ArrayList<>(pQ);

    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(14);
        arrayList.add(34);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(10);

        System.out.println(solution(arrayList, 3));

    }

}
