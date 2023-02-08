package com.dsa.trees;

public class SymmetricBinaryTree {

    public static boolean helper(TreeNode left, TreeNode right) {

        if(left == null || right == null)
            return left == right;

        if(left.data != right.data)
            return false;

        return helper(left.left, right.right) && helper(left.right, right.left);


    }

    public static boolean solution(TreeNode A) {

        return A==null || helper(A.right, A.left);

    }

    public static void main(String[] args) {

        TreeNode root = TreeNode.createTree();
        System.out.println(solution(root));

    }

}
