package LinkedListOJ;

//反转一个单链表。

public class Reverse {
    public ListNode reverseList(ListNode head) {
        ListNode newhead = null;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                newhead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return newhead;
    }
}
