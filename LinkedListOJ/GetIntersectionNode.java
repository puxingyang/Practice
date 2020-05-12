package LinkedListOJ;

//输入两个链表，找出它们的第一个公共结点。
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = getsize(headA);
        int size2 = getsize(headB);
        if(size1 > size2){
            int offset = size1 - size2;
            for(int i = 0;i < offset;i++){
                headA = headA.next;
            }
        }else{
            int offset = size2 - size1;
            for(int i = 0;i < offset;i++){
                headB = headB.next;
            }
        }
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

    public int getsize(ListNode head) {
        int size = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }
}