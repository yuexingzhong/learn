package com.day.algoritm;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/28 9:18
 * Version：1.0.0
 */
public class AddTwoNodes {
    //两个有序链表进行添加合并成一个链表 纯粹codeing
    public static void main(String[] args) {


        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(5);

        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(5);
        listNode1.next.next.next = new ListNode(6);
        listNode1.next.next.next.next = new ListNode(7);

        ListNode listNode2 = addNodes(listNode, listNode1);
        System.out.println();

    }

    public static ListNode addNodes(ListNode head1, ListNode head2) {

        if (head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }
        ListNode head = head1.value <= head2.value ? head1 : head2;
        //得出第一个元素谁比较小
        ListNode cur1 = head.next;
        ListNode cur2 = head1 == head ? head2 : head1;
        ListNode pre = head;

        while (cur1 != null && cur2 != null) {

            if (cur1.value <= cur2.value) {
                pre.next = cur1;
                cur1 = cur1.next;
            } else {
                pre.next = cur2;
                cur2 = cur2.next;
            }
            pre = pre.next;
        }
        pre.next = cur1 != null ? cur1 : cur2;
        return head;


    }
}
