package Stack;

import java.util.Stack;

public class stack {
    static void operations() {
        Stack<Integer> stack = new Stack<>();

        int[] arr = { 3, 5, 6, 7, 74, 25, 54, 23 };

        for (int i : arr) {
            stack.add(i);
        }
        stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.peek());

        System.out.println("removing elemenst of a stack");
        while (stack.isEmpty() != true) {
            System.out.println(stack.pop());
        }
       System.out.println("stack.isEmpty()");
        System.out.println(stack.isEmpty());

    }

    public static void main(String[] args) {
        operations();

    }

}
