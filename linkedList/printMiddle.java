import java.util.Scanner;

import recursion.recursion;

class printMiddle {
    public static int getMiddle(Node head) {
        // Your code here.
        Node<Integer> current = head;
        int n = 0;
        while (current.next != null) {
            n++;
            current = current.next;
        }
        int middleIndex = n / 2;
        for (int i = 0; i <= middleIndex; i++) {
            if (i == middleIndex) {
                return current.data;
            } else {
                current = current.next;
            }
        }
        return -1;

    }

    public static void print(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;

        }
    }

    public static Node<Integer> createLinkedList() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);

            if (head == null) {
                head = currentNode;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                // tail refers to last node
                // now connect currentNode after last node
                tail.next = currentNode;
            }
            data = sc.nextInt();

        }
        return head;

    }

    public static void main(String[] args) {
        print(createLinkedList());

    }
}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}