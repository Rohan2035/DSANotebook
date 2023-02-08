package com.dsa.linkedlist;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {

        this.val = 0;
        this.next = null;

    }

    public ListNode(int val) {

        this.val = val;
        this.next = null;

    }

    public static ListNode createLinkedList(int[] nums) {

        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;

        for(int i = 1; i < nums.length; i ++) {

            cur.next = new ListNode(nums[i]);
            cur = cur.next;

        }

        return head;

    }

    public static void displayLinkedList(ListNode head) {

        ListNode cur = head;

        while(cur != null) {

            System.out.print(cur.val);
            if(cur.next != null) System.out.print(" -> ");
            cur = cur.next;

        }

    }

}
