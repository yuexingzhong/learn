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

        int k = 3;
        reversalNodeByK(listNode, k);


    }

    static ListNode reversalNodeByK(ListNode head, int k) {
        ListNode start = head;
        ListNode end = getKByHead(start, k);
        if (end == null) {
            return head;
        }
        //得出第一组
        head = end;
        reversalNode(start, end);
        ListNode lastEnd = start;
        while (lastEnd.next != null) {
            start = lastEnd.next;
            end = getKByHead(start, k);
            if (end == null) {
                return head;
            }
            reversalNode(start, end);
            lastEnd.next = end;
            lastEnd = start;
        }
        return head;
    }


    static ListNode getKByHead(ListNode start, int k) {
        if (start == null) {
            return null;
        }
        while (--k != 0 && start.next != null) {
            start = start.next;
        }
        return start;
    }

    static void reversalNode(ListNode start, ListNode end) {
        end = end.next;
        ListNode pre = null;
        ListNode cur = start;
        ListNode next = null;
        while (cur != end) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        start.next = end;


    }



    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
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


