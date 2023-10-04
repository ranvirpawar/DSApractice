package Stack;

import arrayList.removeduplicate;

public class implementationStack {

    private int data[];
    private int topIndex;

    // constructor is always equal to class name !!!
    public implementationStack() {
        data = new int[10];
        topIndex = -1;

    }

    public int size() {

        return topIndex + 1;
    }

    public boolean isEmpthy() {

        return topIndex == -1;

    }

    public void push(int element) {

        // topIndex ++;
        data[++topIndex] = element;
    }

    public int top() {
        return data[topIndex];
    }

    public int pop() {
        int temp = data[topIndex];
        topIndex--;
        return temp;

    }

    public static void main(String[] args) {

        implementationStack stack = new implementationStack();

        System.out.println(stack.size());
        stack.push(24);
        stack.push(45);
        stack.push(67);

        System.out.println("is stack empty " + stack.isEmpthy());
        System.out.println("the top element is  " + stack.top());
        stack.pop();
        System.out.println("top element after poping " + stack.pop());

    }

}
