package LinkedListOJ;

//编写代码，以给定值x为基准将链表分割成两部分，
//所有小于x的结点排在大于或等于x的结点之前。
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead == null){
            return null;
        }

        ListNode bigHead = new ListNode(-1);
        ListNode bigTail = bigHead;
        ListNode smallHead = new ListNode(-1);
        ListNode smallTail = smallHead;

        for(ListNode cur = pHead;cur != null;cur = cur.next){
            if(cur.val < x){
                smallTail.next = new ListNode(cur.val);
                smallTail = smallTail.next;
            }else{
                bigTail.next = new ListNode(cur.val);
                bigTail = bigTail.next;
            }
        }
        smallTail.next = bigHead.next;
        return smallHead.next;
    }
}
