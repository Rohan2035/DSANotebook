package com.dsa.heaps;

import java.util.ArrayList;

public class HeapImplementation {

    private static ArrayList<Integer> heap = new ArrayList<>();

    public static void removeHeap() {

        heap.set(0, heap.remove(heap.size() - 1));
        int i = 0;

        while(i < heap.size()) {

            int left = (i * 2) + 1;
            int right = (i * 2) + 2;

            if(left < heap.size() && heap.get(i) > heap.get(left)) {

                int temp = heap.get(i);
                heap.set(i, heap.get(left));
                heap.set(left, temp);

                i = left;

            } else if(right < heap.size() && heap.get(i) > heap.get(right)) {

                int temp = heap.get(i);
                heap.set(i, heap.get(right));
                heap.set(right, temp);

                i = right;

            } else return;

        }

    }

    public static void insertHeap(int data) {

        heap.add(data);
        if(heap.size() == 1) return;

        int index = heap.size() - 1;
        int i = heap.size() - 1;

        while(i > 0) {

            i  = i / 2;

            if(heap.get(i) > heap.get(index)) {

                int temp = heap.get(i);
                heap.set(i, heap.get(index));
                heap.set(index, temp);

                index = i;

            }

        }

    }

    public static void main(String[] args) {

        insertHeap(4);
        insertHeap(5);
        insertHeap(2);
        insertHeap(3);
        insertHeap(1);

        removeHeap();

        System.out.println(heap);

    }

}
