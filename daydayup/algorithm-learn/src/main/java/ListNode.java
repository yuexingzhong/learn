/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/27 9:22
 * Version：1.0.0
 */
public class ListNode {
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
