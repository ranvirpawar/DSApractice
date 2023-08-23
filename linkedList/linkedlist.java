import java.util.Scanner;

class linkedlist {

    public static Node<Integer> createLinkedListhardCode() {
        Node<Integer> s1 = new Node(10);
        Node<Integer> s2 = new Node(20);
        Node<Integer> s3 = new Node(30);
        Node<Integer> s4 = new Node(40);
        Node<Integer> s5 = new Node(45);

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;

        return s1;

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

    /// Calculating the length of linked list

    public static void calculatelength(Node<Integer> head) {
        Node<Integer> current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        System.out.println(" ");
        System.out.println(length + " is the length of linkedList");
    }

    /// printing i th node of linked list

    public static void printIthNode(Node<Integer> head, int i) {
        Node<Integer> current = head;
        int count = 0;
        while (current != null) {
            if (count == i) {
                System.out.println(current.data + " is value at given ith place");
                break;
            }
            count++;
            current = current.next;

        }

    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        print(head);
        calculatelength(head);
        int i = 3;
        printIthNode(head, i);

    }
}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = next;
    }

}