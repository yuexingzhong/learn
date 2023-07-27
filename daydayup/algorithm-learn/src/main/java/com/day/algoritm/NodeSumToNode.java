package com.day.algoritm;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/27 9:22
 * Version：1.0.0
 */
public class NodeSumToNode {

    /*
    将两个链表添加
     */
    public static void main(String[] args) {
        ListNode listNode = new ListNode(9);
        listNode.next = new ListNode(5);
        listNode.next.next = new ListNode(6);
        listNode.next.next.next = new ListNode(8);

        ListNode listNode1 = new ListNode(9);
        listNode1.next = new ListNode(5);
        listNode1.next.next = new ListNode(6);


        ListNode node = getNode(listNode, listNode1);
    }

    private static ListNode getNode(ListNode listNode, ListNode listNode1) {
        int i = nodeSize(listNode);
        int i1 = nodeSize(listNode1);

        ListNode l = i > i1 ? listNode : listNode1;
        ListNode s = l == listNode ? listNode1 : listNode;

        ListNode curL = l;
        ListNode curS = s;
        //记录长链表最后一个
        ListNode last = null;
        int remainder = 0;
        while (curS != null) {
            int sum = curS.value + curL.value + remainder;
            int yu = sum % 10;
            curL.value = yu;
            remainder = sum / 10;
            last = curL;
            curS = curS.next;
            curL = curL.next;
        }

        while (curL != null) {
            int sum = curL.value + remainder;
            int yu = (sum) % 10;
            remainder = sum / 10;
            curL.value = yu;
            last = curL;
            curL = curL.next;
        }

        if (remainder != 0) {
            last.next = new ListNode(remainder);
        }

        return l;
    }

    public static int nodeSize(ListNode head) {
        int i = 1;
        while (head.next != null) {
            i++;
            head = head.next;
        }
        return i;
    }
}
