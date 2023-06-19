package com.day.algoritm.day1;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2023/6/15 17:12
 * Version：1.0.0
 */
public class NodePlay {

    public static void main(String[] args) {

//        ListNode node = new ListNode(1);
//        node.next = new ListNode(2);
//        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(4);
//
//        node = reversalListNode(node);
//        print(node);

        ListDoubleNode listDoubleNode = new ListDoubleNode(1);
        listDoubleNode.next = new ListDoubleNode(2);
        listDoubleNode.next.last = new ListDoubleNode(1);

        listDoubleNode.next.next = new ListDoubleNode(3);
        listDoubleNode.next.next.last = new ListDoubleNode(2);


        listDoubleNode = reversalListDoubleNode(listDoubleNode);
        printDoubleNode(listDoubleNode);


    }


    public static void print(ListNode head) {
        ListNode next = head;
        while (next != null) {
            System.out.println(next.value);
            next = next.next;

        }
    }

    public static void printDoubleNode(ListDoubleNode head) {
        ListDoubleNode next = head;
        while (next != null) {
            System.out.println(next.value);
            next = next.next;

        }
    }


    public static ListNode reversalListNode(ListNode head) {
        ListNode pre = null;
        ListNode str = head;
        while (str != null) {
            ListNode next = str.next;
            str.next = pre;
            pre = str;
            str = next;
        }
        return pre;
    }

    public static ListDoubleNode reversalListDoubleNode(ListDoubleNode head) {
        ListDoubleNode pre = null;
        ListDoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.last = next;
            head.next = pre;
            pre = head;
            head = next;

        }
        return pre;
    }


}


class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}

class ListDoubleNode {
    int value;

    ListDoubleNode last;

    ListDoubleNode next;

    public ListDoubleNode(int value) {
        this.value = value;
    }

    public ListDoubleNode(int value, ListDoubleNode last, ListDoubleNode next) {
        this.value = value;
        this.last = last;
        this.next = next;
    }
}

class MyQuenu {

}
