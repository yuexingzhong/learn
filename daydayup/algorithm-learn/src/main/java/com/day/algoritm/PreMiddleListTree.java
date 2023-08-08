package com.day.algoritm;

import java.util.HashMap;
import java.util.Map;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/8 9:52
 * Version：1.0.0
 */
public class PreMiddleListTree {


    public static void main(String[] args) {

        int[] pr = new int[]{1, 2};
        int[] in = new int[]{2, 1};

        buildTree(pr, in);
    }


    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = inorder.length - 1; i >= 0; i--) {
            map.put(inorder[i], i);
        }
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }
        return g(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }


    public static TreeNode g(int[] preorder, int l1, int r1, int[] inorder, int l2, int r2, Map<Integer, Integer> map) {

        if (l1 > r1) {
            return null;
        }
        TreeNode head = new TreeNode(preorder[l1]);
        if (l1 == r1) {
            return head;
        }

        Integer find = map.get(preorder[l1]);

        head.left = g(preorder, l1 + 1, l1 + find - l2, inorder, l2, find, map);
        head.right = g(preorder, l1 + find - l2 + 1, r1, inorder, find + 1, r2, map);

        return head;

    }


}
