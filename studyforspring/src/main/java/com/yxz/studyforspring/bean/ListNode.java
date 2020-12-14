package com.yxz.studyforspring.bean;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @author YUEXINGZHONG  2020/10/13 15:54
 * @version V1.0.0
 */
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
