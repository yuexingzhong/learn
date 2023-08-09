package com.day.algoritm;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/9 9:46
 * Version：1.0.0
 */
public class SearchTree {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 5;
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(6);
        treeNode.right.left = new TreeNode(3);
        treeNode.right.right = new TreeNode(7);
        System.out.println(isValidBST(treeNode));


    }

    public static boolean isValidBST(TreeNode root) {

        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static Boolean isValidBST(TreeNode root, Long min, Long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }

        return isValidBST(root.left, min, (long) root.val)&&isValidBST(root.right, (long) root.val,max);

    }


}
