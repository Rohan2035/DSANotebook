package com.dsa.trees;


public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {

        this.data = 0;
        this.left = null;
        this.right = null;

    }

    public TreeNode(int data) {

        this.data = data;
        this.left = null;
        this.right = null;

    }

    public static TreeNode createTree() {

        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(1);

        return root;

    }

}
