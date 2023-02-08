package com.dsa.trees;

public class SortedArrayToBalancedBST {

    public static TreeNode helper(int left, int right, int[] A) {

        if(left > right)
            return null;

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = helper(left, mid - 1, A);
        root.right = helper(mid + 1, right, A);

        return root;

    }

    public static TreeNode solution(int[] A) {

        return helper(0, A.length - 1, A);

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        System.out.println(Traversals.inOrder(solution(arr)));

    }

}
