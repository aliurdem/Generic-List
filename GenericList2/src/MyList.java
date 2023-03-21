public class MyList<T>{
    private T[] arr;
    private T[] tempArr;
    private int size;
    private int capacity;
    @SuppressWarnings("unchecked")
    MyList(){
        this.capacity = 10;
        this.arr = (T[]) new Object[10];
    }
    @SuppressWarnings("unchecked")
    MyList(int capacity){
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    public void add(T data){
        if(size() != this.capacity){
            arr[size()] = data;
        }else{
            copyToTempArr();
            incraseCapacity();
            arr[size()] = data;
        }
    }

    public int size(){
        int size = 0;
        for(int i = 0 ; i<capacity;i++){
            if(arr[i] != null){
                size++;
            }
        }
        return size;
    }
    public boolean contains(T data){
        for(int i = 0 ; i<size();i++){
            if(arr[i] == data){
                return true;
            }
        }
        return false;
    }
    public MyList<T> sublist(int start ,int finish){
        MyList<T> sublist = new MyList<>();
        for(int i = 0,z = start; i<(finish-start)+1;i++){
            sublist.add(arr[z++]);
        }
        return sublist;
    }


    public void clear(){
        for(int i = 0; i<capacity;i++ ){
            arr[i] = null;
        }
    }

    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }else{
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    public void incraseCapacity(){
        setCapacity(getCapacity()*2);
        this.arr = (T[]) new Object[getCapacity()];
        for(int i = 0 ; i< tempArr.length;i++){
            arr[i] = tempArr[i];
        }
    }
    @SuppressWarnings("unchecked")
    public void copyToTempArr(){
        tempArr = (T[]) new Object[capacity];
        for(int i = 0 ; i<size();i++){
            tempArr[i] = arr[i];
        }
    }

    public T get(int i){ return arr[i]; }

    public int indexOf(T data){
        for(int i = 0 ; i<size();i++){
            if(arr[i] == data){
               return i;
            }
        }
        return -1;
    }

    public void remove(int i){
        tempArr = (T[]) new Object[capacity];
        for(int z = 0,k=0; z<size();z++){
            if(z == i){
                continue;
            }
            tempArr[k++] = arr[z];
        }
        arr = tempArr;
    }

    public void set(int i,T data){
        for(int z = 0 ; z<size();z++){
            if(z ==i){
                arr[i] = data;
            }
        }
    }

    public String toString(){
        String str = "";
        str += '[';
        if(!isEmpty()){
            for(int i = 0;i<size();i++){
                String item = arr[i].toString();
                str += item;
                if(i == size()-1){continue;}
                else{str +=",";}
            }
        }
        str+="]";

    return str;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public T[] getTempArr() {
        return tempArr;
    }

    public void setTempArr(T[] tempArr) {
        this.tempArr = tempArr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
