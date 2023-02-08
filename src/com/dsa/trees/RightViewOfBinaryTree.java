package com.dsa.trees;

import java.util.ArrayList;

public class RightViewOfBinaryTree {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static void rightView(TreeNode A,  int level) {

        if(A != null) {

            if(level == list.size()) {

                list.add(A.data);

            }

            rightView(A.right, level + 1);
            rightView(A.left, level + 1);

        }

    }

    public static ArrayList<Integer> solution(TreeNode A) {

        rightView(A, 0);
        return list;

    }


    public static void main(String[] args) {

        TreeNode A = TreeNode.createTree();
        System.out.println(solution(A));

    }

}
