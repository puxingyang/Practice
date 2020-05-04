package SeqList;

public class SeqList {
    private int[] datas = new int[100];
    private int size = 0;

    public void display() {
        //依次打印出每个元素
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += datas[i];
            if (i < size - 1) {
                result += ",";
            }
        }
        result += "]";
        System.out.println(result);
    }

    //pos表示新元素插入的位置；data表示新元素的值
    public void add(int pos, int data) {
        //判定pos是否为有效值
        if (pos < 0 || pos > size) {
            return;
        }
        //扩容，顺序表容量不够自动扩容
        if(size>=datas.length){
            //需要扩容
            int[]newDatas=new int[2*datas.length];
            for(int i=0;i<datas.length;i++){
                newDatas[i]=datas[i];
            }
            datas=newDatas;
        }
        //尾插的情况（把新元素放在下标为size的地方）
        if (pos == size) {
            datas[pos] = data;
            size++;
            return;
        }
        //普通位置的插入
        for(int i=size-1;i>=pos;i--){
            datas[i+1]=datas[i];
        }
        datas[pos]=data;
        size++;
    }

    public boolean contains(int toFind){
        //循环访问每个元素
        for(int i=0;i<size;i++){
            if(datas[i]==toFind){
                return true;
            }
        }
        return false;
    }

    public int search(int toFind){
        for(int i=0;i<size;i++){
            if(datas[i]==toFind){
                return i;
            }
        }
        return -1;
    }

    public int getPos(int pos){
        if(pos<0||pos>=size){
            //return null;//返回一个非法值
            //暂不考虑非法情况
            //throw new Exception("pos下标越界");//抛出异常
        }
        return datas[pos];
    }

    public void setPos(int pos,int data){
        datas[pos]=data;
    }

    //toRemove表示要删除的元素
    public void remove(int toRemove){
       //1.先找到toRemove的下标；
        int pos=search(toRemove);
       //2.下标是最后一个直接删除；
        if(pos==size-1){
            size--;
            return;
        }
       //3.如果是中间元素先搬运再删除。
        for (int i =pos; i <size-1 ; i++) {
            datas[i]=datas[i+1];
        }
        size--;
    }
    public int getSize(){
        //size只能提供get方法，不能提供set方法
        return size;
    }

    public void clear(){
        size=0;
    }
}
