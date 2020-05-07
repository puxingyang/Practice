package LinkedList;

class Node{
    public int data; //数据
    public Node next = null; //下一个结点的位置

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    private Node head = null;

    public void addFirst(int data) {
        //链表头插
        //根据data值创建一个链表节点（Node对象）
        Node node = new Node(data);
        //空链表
        if (head == null) {
            head = node;
            return;
        }
        //不是空链表
        node.next = head;
        head = node;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = node;
    }

    public void display() {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.data + " ");
        }
        System.out.println();
    }

    public int getsize() {
        int size = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    //插入成功，返回true；否则false
    public boolean addIndex(int index, int data) {
        int size = getsize();
        if (index < 0 || index > size) {
            //判定index是否有效
            return false;
        }
        //如果index为0，头插
        if (index == 0) {
            addFirst(data);
            return true;
        }
        //如果index为size，尾插
        if (index == size) {
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        //如果index是中间位置,先找到index-1的位置
        //先找到index-1
        Node prev = getPos(index-1);
        //把新节点插入到prev之后
        node.next = prev.next;
        prev.next = node;
        return true;
    }
        private Node getPos(int index){
            Node cur = head;
            for(int i = 0;i< index;i++){
                cur = cur.next;
            }
            return cur;
    }
    
    public boolean contains(int toFind){
        for(Node cur = head;cur != null;cur = cur.next){
            if(cur.data == toFind){
                return true;
            }
        }
        return false;
    }
    
    public void remove(int toremove){
        //是否是头节点，特殊处理
        if(head.data == toremove){
            head = head.next;
            return;
        }
        
        Node prev = SearchPrev(toremove);
        //prev.next = prev.next.next;
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }
    private Node SearchPrev(int toremove){
        //找toremove的前一个节点
        for(Node cur = head;cur != null 
                && cur.next != null;cur = cur.next){
            if(cur.next.data == toremove){
                return cur;
            }
        }
        return null;
    }
    
    public void removeAll(int toRemove){
        Node prev = head;
        Node cur = head.next;
        while(cur != null){
            if(cur.data == toRemove){
                prev.next = cur.next;
                cur = prev.next;
            }else{
                prev = prev.next;
                cur = cur.next;
            }
        }
        if(head.data == toRemove){
            head = head.next;
        }
    }
}


