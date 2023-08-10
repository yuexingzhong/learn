package com.day.algoritm;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/10 9:31
 * Version：1.0.0
 */
public class TreePathSum {

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;
        treeNode.left = new TreeNode(2);

        treeNode.right = new TreeNode(3);

        System.out.println(hasPathSum(treeNode, 5));

    }

    public static boolean isSum = false;

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        process(root, 0, targetSum);
        return isSum;
    }

    public static void process(TreeNode node, int pre, int targetSum) {

        if (node.left == null && node.right == null) {
            if (pre + node.val == targetSum) {
                isSum = true;
                return;
            }
        }
        pre += node.val;
        if (node.left != null) {
            process(node.left, pre, targetSum);
        }
        if (node.right != null) {
            process(node.right, pre, targetSum);
        }
    }


}
