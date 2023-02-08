package com.dsa.trees;
import java.util.ArrayList;

public class RootToLeafPathWithSum {

    public void helper(ArrayList<ArrayList<Integer>>  result, ArrayList<Integer> list, TreeNode root, int sum) {

        if(root == null)
            return;

        list.add(root.data);
        if(root.data == sum && root.right == null && root.left == null) {

            result.add(new ArrayList<>(list));

        }

        helper(result, list, root.left, sum - root.data);
        helper(result, list, root.right, sum - root.data);

        list.remove(list.size() - 1);

    }

    public ArrayList<ArrayList<Integer>> solution(TreeNode root, int B) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<Integer>(), root, B);
        return result;

    }


}
