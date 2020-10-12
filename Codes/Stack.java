package summer2k17;
public class Stack {
    int [] element;
    int size;
    public Stack(){
        
    }
    public Stack(int capacity){
        element=new int[capacity];
        size=0;
    }

    public int push(int n){
        element[size]=n;
        size++;
        return 0;
    }
    public int pop(){
        --size;
        return element[size];
    }
    public int peek(){
        return element[size-1];
    }
    public int getSize(){
        return size;
    }
    public boolean empty(){
        if (size==0) return true;
        else return false;
    }
}


