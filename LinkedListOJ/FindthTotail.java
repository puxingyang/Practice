package LinkedListOJ;

//输入一个链表，输出该链表中倒数第k个结点。
public class FindthTotail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null){
            return null;
        }
        int size = getsize(head);
        if(k < 0 || k > size){
            return null;
        }
        int offset = size - k;
        ListNode cur = head;
        for(int i = 0;i <= offset;i++){
            cur = cur.next;
        }
        return cur;
    }

    private int getsize(ListNode head){
        for(ListNode cur = head;cur != null;cur = cur.next){
            size++;
        }
        return size;
    }
}
