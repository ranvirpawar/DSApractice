
public class insertNode {
    public static Node<Integer> insertnodeInBeetween(Node<Integer> s1, int pos) {
        int currPos = 0;
        Node<Integer> newNode = new Node(2000);
        Node<Integer> current = s1;

        while (current != null && currPos < (pos - 1)) {
            current = current.next;
            currPos++;
        }
        
        newNode.next = current.next;
        current.next = newNode;
        return s1;

    }

    public static Node<Integer> insertNewNodeAtEnd(Node<Integer> s1) {
        System.out.println("inserting new node of value 1000 at the end ");

        Node<Integer> newNode = new Node(1000);
        Node<Integer> curr = s1;
        // traversing till last node
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return s1;

    }

    public static void print(Node<Integer> head) {
        System.out.println("printing the node");
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");

            current = current.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> s1 = new Node(10);
        Node<Integer> s2 = new Node(20);
        Node<Integer> s3 = new Node(30);
        Node<Integer> s4 = new Node(40);
        Node<Integer> s5 = new Node(45);

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        insertNewNodeAtEnd(s1);
        int pos = 3;

        insertnodeInBeetween(s1, pos);

        print(s1);
    }

}
