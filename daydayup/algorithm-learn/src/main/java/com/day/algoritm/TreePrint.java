package com.day.algoritm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2024/4/1 10:53
 * Version：1.0.0
 */
public class TreePrint {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        print(root);


    }

    public static void print(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        TreeNode last = root;
        TreeNode nextlast = null;
        while (queue.size() > 0) {
            TreeNode poll = queue.poll();
            if (poll.left != null) {
                queue.add(poll.left);
                nextlast = poll.left;
            }
            if (poll.right != null) {
                queue.add(poll.right);
                nextlast = poll.right;
            }
            System.out.print(poll.val);
            if (poll == last) {
                System.out.println();
                last = nextlast;
            }
        }


    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public TreeNode setVal(int val) {
            this.val = val;
            return this;
        }

        public TreeNode getLeft() {
            return left;
        }

        public TreeNode setLeft(TreeNode left) {
            this.left = left;
            return this;
        }

        public TreeNode getRight() {
            return right;
        }

        public TreeNode setRight(TreeNode right) {
            this.right = right;
            return this;
        }
    }
}
