package MidTerm;

public class StackMain {
    public static void main(String[] args) {
        StackOfInt s = new StackOfInt(10);
        s.push(34);
        s.push(23);
        s.pop();s.push(15);
        System.out.println(s.pop());
        s.peek();
        System.out.println(s.peek());
    }
}
