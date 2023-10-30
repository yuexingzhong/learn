package com.day.algoritm;

import java.util.HashSet;
import java.util.Set;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/30 17:26
 * Version：1.0.0
 */
public class ListFirstCommon {

    public static void main(String[] args) {
        ListNode headA = new ListNode(1);


        ListNode headB = new ListNode(1);

        ListNode intersectionNode = getIntersectionNode(headA, headB);
        System.out.println(intersectionNode);
    }

    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        while (headB != null) {
            set.add(new ListNode(headB.value));
            headB = headB.next;
        }
        while (!set.contains(new ListNode(headA.value)) && headA != null) {
            headA = headA.next;
        }

        return headA;


    }


}
