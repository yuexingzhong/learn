package com.day.algoritm;

import java.util.ArrayList;
import java.util.List;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/11 9:36
 * Version：1.0.0
 */
public class TreePathSums {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(6);

        System.out.println(pathSum(treeNode, 8));


    }

    public static List<List<Integer>> pathSum(TreeNode root, int target) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> path = new ArrayList<>();
        process(root, path, 0, target, result);
        return result;
    }

    public static void process(TreeNode x, List<Integer> path, int preNum, int targetSum, List<List<Integer>> result) {
        if (x.left == null && x.right == null) {
            if (preNum + x.val == targetSum) {
                List<Integer> list = new ArrayList<>();
                list.addAll(path);
                list.add(x.val);
                result.add(list);
            }
            return;
        }
        path.add(x.val);
        preNum += x.val;

        if (x.left != null) {
            process(x.left, path, preNum, targetSum, result);
        }

        if (x.right != null) {
            process(x.right, path, preNum, targetSum, result);
        }

        path.remove(path.size() - 1);

    }


}
