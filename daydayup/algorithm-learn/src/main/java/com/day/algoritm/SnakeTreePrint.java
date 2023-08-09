package com.day.algoritm;

import java.util.ArrayList;
import java.util.List;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/8 17:53
 * Version：1.0.0
 */
public class SnakeTreePrint {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right = new TreeNode(3);

        zigzagLevelOrder(treeNode);


    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int direction = 1;
        while (!list.isEmpty()) {
            List<TreeNode> childs = new ArrayList<>();
            List<Integer> subResult = new ArrayList<>();
            for (TreeNode treeNode : list) {
                if (treeNode.left != null) {
                    childs.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    childs.add(treeNode.right);
                }
            }
            if (direction == 1) {
                for (int i = 0; i < list.size(); i++) {
                    subResult.add(list.get(i).val);
                }
                direction = 2;
            } else if (direction == 2) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    subResult.add(list.get(i).val);
                }
                direction = 1;
            }
            result.add(subResult);
//            for (Integer integer : subResult) {
//
//            }
//            for (int i = subResult.size() - 1; i >= 0; i--) {
//                System.out.println(subResult.get(i));
//            }


            list = childs;
        }
        return result;


    }
}
