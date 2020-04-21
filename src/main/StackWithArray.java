package main;

public class StackWithArray {

    private int top;
    private int size = 1000;
    int[] arr = new int[size];

    public StackWithArray() {
        top = -1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public int pop() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int x = arr[top];
        top--;
        return x;
    }

    public boolean push(int x) {

        if(top >= size-1) {
            System.out.println("Stack Overflow");
            return false;
        }
        arr[top+1] = x;
        System.out.println(x + " pushed into stack");
        top++;
        return true;
    }
}
