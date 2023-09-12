package Stack;

import java.util.Stack;

public class reverseStack {
    static void reverseStack() {

        Stack<Integer> stack = new Stack<>();

        int arr[] = { 22, 33, 44, 55, 66, 77, 88, 99 };
        for (int i : arr) {
            stack.push(i);
        }
        System.out.println("top element of original stack is " + stack.peek());
        System.out.println("size of original stack " + stack.size());
        Stack<Integer> newStack = new Stack<>();
        while (stack.isEmpty() != true) {
            newStack.push(stack.pop());
        }
        System.out.println("is original stack empty" + stack.isEmpty());
        System.out.println("top ele of new stack is " + newStack.peek());
        System.out.println("size of new stack " + newStack.size());

    }

    public static void main(String[] args) {
        /// this is just comment ;
        reverseStack();

    }







}
