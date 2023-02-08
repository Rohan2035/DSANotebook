package com.dsa.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagOrderLevelTraversal {

    public static ArrayList<ArrayList<Integer>> solution(TreeNode A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean flag = false;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(A);

        while(!queue.isEmpty()) {

            ArrayList<Integer> sublist = new ArrayList<>(queue.size());


            for(int i = 0; i < queue.size(); i ++) {

                TreeNode node = queue.peek();

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);

                if(flag) sublist.add(node.data);
                else sublist.add(0, node.data);

                queue.poll();

            }

            flag = !flag;
            result.add(sublist);

        }

        return result;

    }


    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> sol = solution(TreeNode.createTree());
        System.out.println(sol);

    }

}

