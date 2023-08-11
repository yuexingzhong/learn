package com.day.algoritm;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/11 9:36
 * Version：1.0.0
 */
public class TreePathNum {

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

    public static int result = 0;

    public static int pathSum(TreeNode root, int sum) {

        if (root == null) {
            return result;
        }
        process(root, 0, sum);
        return result;
    }

    public static void process(TreeNode x, int preNum, int targetSum) {
        if (x.left == null && x.right == null) {
            if (preNum + x.val == targetSum) {
                result += 1;
            }
            return;
        }
        preNum += x.val;

        if (x.left != null) {
            process(x.left, preNum, targetSum);
        }

        if (x.right != null) {
            process(x.right, preNum, targetSum);
        }
    }


}
