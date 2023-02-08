package com.dsa.linkedlist;

public class ReverseLinkedList {

    public static ListNode solution(ListNode head) {

        ListNode cur = head, next = head, prev = null;

        while(cur != null) {

            next = next.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }

        head = prev;
        return head;

    }

    public static void main(String[] args) {

        ListNode head = ListNode.createLinkedList(new int[]{5, 4, 3, 2, 1});

        head = solution(head);

        ListNode.displayLinkedList(head);

    }

}
