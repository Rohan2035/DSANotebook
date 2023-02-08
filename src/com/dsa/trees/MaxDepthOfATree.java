package com.dsa.trees;

public class MaxDepthOfATree {

    public static int solution(TreeNode A) {

        if(A == null)
            return 0;

        int lDepth = solution(A.left);
        int rDepth = solution(A.right);

        if(lDepth > rDepth)
            return lDepth + 1;

        else
            return rDepth + 1;

    }

    public static void main(String[] args) {

        TreeNode A = TreeNode.createTree();

        System.out.println(solution(A));

    }

}
