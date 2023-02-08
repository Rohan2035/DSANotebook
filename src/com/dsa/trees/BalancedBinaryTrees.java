package com.dsa.trees;

public class BalancedBinaryTrees {

    public static int helper(TreeNode A) {

        if(A == null) return 0;

        int left = helper(A.left);
        if(left == -1) return -1;

        int right = helper(A.right);
        if(right == -1) return -1;

        if(Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;

    }

    public static int solution(TreeNode A) {

        if(helper(A) != -1) return 1;
        return 0;

    }

    public static void main(String[] args) {

        int res = solution(TreeNode.createTree());
        System.out.println(res);

    }

}
