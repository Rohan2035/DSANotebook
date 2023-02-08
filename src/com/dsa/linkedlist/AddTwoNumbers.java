package com.dsa.linkedlist;

public class AddTwoNumbers {

    public static ListNode solution(ListNode head1, ListNode head2) {

        ListNode cur1 = head1, cur2 = head2;
        ListNode res = null, cur3 = null;
        int sum, carry = 0;

        while(cur1 != null && cur2 != null) {

            sum = cur1.val + cur2.val + carry;

            if(sum >= 10) {

                if(sum == 10) {

                    sum = 0;
                    carry = 1;

                } else {

                    carry = sum / 10;
                    sum = sum % 10;

                }

            } else carry = 0;

            if(res == null) {

                res = new ListNode(sum);
                cur3 = res;

            } else {

                cur3.next = new ListNode(sum);
                cur3 = cur3.next;
            }

            cur1 = cur1.next;
            cur2 = cur2.next;

        }

        while(cur1 != null) {

            sum = cur1.val + carry;

            if(sum >= 10) {

                if(sum == 10) {

                    sum = 0;
                    carry = 1;

                } else {

                    carry = sum / 10;
                    sum = sum % 10;

                }

            } else carry = 0;

            cur3.next = new ListNode(sum);
            cur3 = cur3.next;

            cur1 = cur1.next;

        }

        while(cur2 != null) {

            sum = cur2.val + carry;

            if(sum >= 10) {

                if(sum == 10) {

                    sum = 0;
                    carry = 1;

                } else {

                    carry = sum / 10;
                    sum = sum % 10;

                }

            } else carry = 0;

            cur3.next = new ListNode(sum);
            cur3 = cur3.next;

            cur2 = cur2.next;

        }

        if(carry == 1) cur3.next = new ListNode(1);

        return res;

    }


    public static void main(String[] args) {

        ListNode list1 = ListNode.createLinkedList(new int[]{1,3,4});
        ListNode list2 = ListNode.createLinkedList(new int[]{9,8,7,5});

        ListNode res = solution(list1, list2);

        while(res != null) {

            System.out.println(res.val);
            res = res.next;

        }

    }

}
