package com.day.algoritm;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/2 9:33
 * Version：1.0.0
 */
public class TreeIsMirror {


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();

        Boolean mirror = isMirror(treeNode, treeNode);
        System.out.println(mirror);


    }

    public static Boolean isMirror(TreeNode node1, TreeNode node2) {

        if (node1 == null ^ node2 == null) {
            return false;
        }
        if (node1 == null) {
            return true;
        }
        if (node1.val == node2.val) {
            return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
        } else {
            return false;
        }

    }
}
