package com.dsa.trees;

import java.util.ArrayList;

public class KthSmallestElementInBST {

    public static void main(String[] args) {

        TreeNode root = TreeNode.createTree();
        ArrayList<Integer> sol = Traversals.inOrder(root);
        int k = 1;
        System.out.println(sol.get(k));

    }

}
