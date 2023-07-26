package com.day.algoritm;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/13 13:36
 * Version：1.0.0
 */
public class NodeStack {


}

class Node {
    public Node next;//指向下一个结点
    Integer value;

    public Node(Node next, Integer value) {
        this.next = next;
        this.value = value;
    }
    public Node(Integer value) {
        this.value = value;
    }
}



