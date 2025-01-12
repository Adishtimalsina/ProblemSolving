
public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

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
        size++;
    }

   public void insertAtHead(int val) {
        Node newNode = new Node(val);
       if(head == null) {
           head = newNode;
       }
       newNode.next = head;
       head = newNode;
       size++;
   }

   //delete data from the head
   public void deleteDataAtHead() {
        head = head.next;
        size--;
   }

   //delete data from the tail
    public void deleteDataAtTail() {
       Node current = head;
        while(current.next.next != null) {
            current = current.next;
        }
        tail = current;
        tail.next = null;
        size--;
        }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public void printSize(){
        System.out.println("Size of Linked list is: " + size);
    }


}







