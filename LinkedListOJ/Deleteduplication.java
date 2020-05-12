package LinkedListOJ;

//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
// 重复的结点不保留，返回链表头指针
public class Deleteduplication {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode newHead = new ListNode(-1);
        ListNode newTail = newHead;

        //循环遍历链表
        ListNode cur = pHead;
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                //跳过重复元素区间，最终指向重复元素区间的最后一个元素
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                //跳过最后一个重复元素
                cur = cur.next;
            }else{
                newTail.next = new ListNode(cur.val);
                newTail = newTail.next;
                cur = cur.next;
            }
        }
        return newHead.next;
    }
}
