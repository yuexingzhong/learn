package com.day.algoritm;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/7 19:53
 * Version：1.0.0
 */
public class TreeDeepHeight {


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

    }

    public static void main(String[] args) {

        maxDepth(new TreeNode());
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;


    }

}
