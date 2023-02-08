package com.dsa.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class NumComponents {

    public static int solution(ListNode head, int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i : nums) set.add(i);
        boolean inComponent = false;
        int components = 0;

        ListNode node = head;

        while (node != null) {

            int value = node.val;

            if (set.contains(value)) {

                if (!inComponent) {

                    inComponent = true;
                    components++;

                }

            } else {

                if (inComponent) {

                    inComponent = false;

                }

            }

            node = node.next;

        }

        return components;

    }

}