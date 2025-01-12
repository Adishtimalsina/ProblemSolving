
public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList() {
    }

    public LinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public static class Node {
       private int val;
       private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void insertDataAtEnd(int val) {
        Node newNode = new Node(val);
        if(head == null) {
           head = newNode;
        }
        if(head.next == null) {
            tail = head;
        }
        tail.next = newNode;
        tail = newNode;
    }

   public void insertAtHead(int val) {
        Node newNode = new Node(val);
       if(head == null) {
           head = newNode;
       }
       newNode.next = head;
       head = newNode;
   }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }


}







