package com.day.algoritm;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/26 9:23
 * Version：1.0.0
 */
public class KNodeRevrese {

    public static void main(String[] args) {

        ListNode listNode = null;
        for (int i = 1; i <= 10; i++) {
            if (listNode == null) {
                listNode = new ListNode(i);
            } else {
                listNode.addNode(new ListNode(i));
            }
        }

        System.out.println(listNode);

    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public void addNode(ListNode node) {
            if (next == null) {
                next = node;
                return;
            }
            ListNode list = next;

            while (list.next != null) {
                list = list.next;
            }
            list.next = node;
        }

    }
}


