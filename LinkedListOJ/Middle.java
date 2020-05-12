package LinkedListOJ;

//给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
//        如果有两个中间结点，则返回第二个中间结点。
public class Middle {
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        int steps = getSize(head)/2;
        ListNode cur = head;
        for(int i = 0;i < steps;i++){
            cur = cur.next;
        }
        return cur;
    }

    private int getSize(ListNode head){
        int size = 0;
        for(ListNode cur = head;cur != null;cur = cur.next){
            size++;
        }
        return size;
    }
}
