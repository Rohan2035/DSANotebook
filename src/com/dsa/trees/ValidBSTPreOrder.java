package com.dsa.trees;

import java.util.ArrayList;
import java.util.Stack;

public class ValidBSTPreOrder {

    public static int solution(ArrayList<Integer> A) {

        Stack<Integer> preorder = new Stack<>();
        preorder.push(A.get(0));
        int root = Integer.MIN_VALUE;
        int prev = A.get(0);

        for(int i = 1; i < A.size(); i ++) {

            if(prev == A.get(i)) return 0;

            while(!preorder.isEmpty() && A.get(i) > preorder.peek()) root = preorder.pop();

            if(A.get(i) < root) return -1;

            preorder.push(A.get(i));
            prev = A.get(i);

        }

        return 1;

    }

    public static void main(String[] args) {

        TreeNode root = TreeNode.createTree();
        ArrayList<Integer> preOrderList = Traversals.preOrder(root);
        System.out.println(solution(preOrderList));

    }

}
