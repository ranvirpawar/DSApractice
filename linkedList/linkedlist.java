class linkedlist {

    public static Node<Integer> createLinkedList() {
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
    public static  void print(Node<Integer> head){
        Node<Integer> current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;

        }

    }

    public static void main(String[] args) {
       Node<Integer> head = createLinkedList();
        print(head);

    }
}

class Node<T> {
    T data;
    Node <T> next;

    Node(T data) {
        this.data = data;
        this.next = next;
    }

}