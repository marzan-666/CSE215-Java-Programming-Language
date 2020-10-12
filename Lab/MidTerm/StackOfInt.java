package MidTerm;

public class StackOfInt {
    private int [] elements;
    private int size;
    StackOfInt(){
        this(16);
    }
    StackOfInt(int capacity){
        //this.elements=elements;
        elements=new int[capacity];
    }
    public boolean empty(){
        if(size==0) return true;
        else return false;
    }
    public int peek(){
        if(size>0){
            return elements[size-1];
        }else return -1;
    }
    public int push(int value){
        if(size<elements.length){
            elements[size]=value;
            size++;
        }else return -1;
        return size;
    }
    public int pop(){
        if(size>0){
            size=size-1;
        }else return -1;
        return elements[size];
    }
    public int getSize(){
        return size;
    }
    
}