package com.dsa.trees;

import java.util.ArrayList;

public class Traversals {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<Integer> inOrder(TreeNode root) {

        if(root != null) {

            inOrder(root.left);
            list.add(root.data);
            inOrder(root.right);

        }

        return list;

    }


    public static ArrayList<Integer> preOrder(TreeNode root) {

        if(root != null) {

            list.add(root.data);
            preOrder(root.left);
            preOrder(root.right);

        }

        return list;

    }

    public static ArrayList<Integer> postOrder(TreeNode root) {

        if(root != null) {

            postOrder(root.left);
            list.add(root.data);
            postOrder(root.right);

        }

        return list;
    }


}
