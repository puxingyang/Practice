package Java15;


import java.util.Stack;

//class Solution {
//    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
//        for (; k > 0; k--) {
//            int previous = grid[grid.length - 1][grid[0].length - 1];
//            for (int row = 0; row < grid.length; row++) {
//                for (int col = 0; col < grid[0].length; col++) {
//                    int temp = grid[row][col];
//                    grid[row][col] = previous;
//                    previous = temp;
//                }
//            }
//        }
//
//        List<List<Integer>> result = new ArrayList<>();
//        for (int[] row : grid) {
//            List<Integer> listRow = new ArrayList<>();
//            result.add(listRow);
//            for (int v : row) listRow.add(v);
//        }
//
//        return result;
//    }
//}
//
//public class Solution {
//    public int getImportance(List<Employee> employees, int id) {
//        if(employees.size() == 0){
//            return 0;
//        }
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(id);
//        int result = 0;
//        while(!(queue.size() == 0)){
//            int temp = queue.poll();
//            for(Employee employee : employees){
//                if(temp == employee.id){
//                    result += employee.importance;
//                    for(int i : employee.subordinates){
//                        queue.add(i);
//                    }
//                }
//            }
//        }
//        return result;
//    }
//}
//
//
//
//class Solution {
//    public int findJudge(int N, int[][] trust) {
//        int[] cnt = new int[N+1];//统计出入度
//        for (int[] index : trust) {
//            cnt[index[0]]--;//出度--
//            cnt[index[1]]++;//入度++
//        }
//        for ( int i = 1; i <= N; i++ ) {
//            if ( cnt[i] == N-1 ) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
//public class Solution {
//    public boolean canThreePartsEqualSum(int[] A) {
//        int sum = 0;
//        for (int i : A) {
//            sum += i;
//        }
//        if (sum % 3 != 0) {
//            return false;
//        }
//        int left = 0;
//        int right = A.length - 1;
//        int leftsum = A[left];
//        int rightsum = A[right];
//        while (left + 1 < right) {
//            if (leftsum == sum / 3 && rightsum == sum / 3) {
//                return true;
//            }
//            if (leftsum != sum / 3) {
//                leftsum += A[++left];
//            }
//            if (rightsum != sum / 3) {
//                rightsum += A[--right];
//            }
//        }
//        return false;
//    }
//}

//class MyLinkedList {
//
//    class Node{
//        int val;
//        Node next;
//
//        public Node(){
//            next = null;
//            val = 0;
//        }
//        public Node(int val){
//            next = null;
//            this.val = val;
//        }
//        public Node(int val,Node next){
//            this.next = next;
//            this.val = val;
//        }
//
//        @Override
//        public String toString() {
//            return super.toString();
//        }
//    }
//
//    int size = 0;
//    Node aHead = null;
//    /** Initialize your data structure here. */
//    public MyLinkedList() {
//        aHead = new Node();
//    }
//
//    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
//    public int get(int index) {
//        if(index < 0 || index >= size)
//            return -1;
//        Node cur = aHead.next;
//        for(int i = 0;i< index;i++){
//            cur = cur.next;
//        }
//        return  cur.val;
//    }
//
//    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
//    public void addAtHead(int val) {
//        addAtIndex(0,val);
//    }
//
//    /** Append a node of value val to the last element of the linked list. */
//    public void addAtTail(int val) {
//        addAtIndex(size,val);
//    }
//
//    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
//    public void addAtIndex(int index, int val) {
//        if(index > size)
//            return;
//
//        Node prev = aHead;
//        for(int i=0;i < index;i++){
//            prev = prev.next;
//        }
//        prev.next = new Node(val,prev.next);
//        size++;
//    }
//
//    /** Delete the index-th node in the linked list, if the index is valid. */
//    public void deleteAtIndex(int index) {
//        if(index < 0 || index >= size)
//            return;
//        Node prev = aHead;
//        for(int i=0;i < index ;i++){
//            prev = prev.next;
//        }
//        prev.next = prev.next.next;
//        size--;
//    }
//}


//    void bubbleSort(int[] array) { 
//    for (int end = array.length; end > 0; end--) { 
//        boolean sorted = true;
//        for (int i = 1; i < end; i++) { 
//            if (array[i - 1] > array[i]) {
//                Swap(array, i - 1, i);
//                sorted = false; 
//            } 
//        }
//        if (sorted == true) { 
//            break; 
//        } 
//    } 
//}
//
//int binarySearch(int[] array, int value) {
//    int begin = 0;
//    int end = array.length - 1;
//    while (begin <= end) {
//        int mid = begin + ((end - begin) / 2);
//        if (array[mid] < value){
//            begin = mid + 1;
//        }
//        else if (array[mid] > value){
//            end = mid - 1;
//        } else {
//            return mid;
//        }
//        return -1;
//    }
//}
//
//class StockSpanner{
//    Stack<Integer>prices,weights;
//    
//    public StockSpanner() {
//        prices = new Stack();
//        weights = new Stack();
//    }
//
//    public int next(int price) {
//        int n = 1;
//        while(!prices.isEmpty() && prices.peek() <= price){
//            prices.pop();
//            n += weights.pop();
//        }
//        prices.push(price);
//        weights.push(n);
//        return n;
//    }
//}


/*1.逆波兰表达式求解,定义一个栈辅助计算;
2.当遇到运算符"+"、"-"、"*"、"/"时,从栈中pop出两个数字计算,否则将数字入栈;
3.完结。*/
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(s.equals("-")){
                stack.push(-stack.pop() + stack.pop());
            }else if(s.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(s.equals("/")){
                int num = stack.pop();
                stack.push(stack.pop() / num);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
