class TripleNextLinkedList {
   static Node head = null;
   static Node tail = null;
   static  Node triple_next = null;

   public static class Node {
    int data;
    Node next;
    Node triple_next;

    Node (int d) {
        this.data = d;
        this.next = null;
        this.triple_next = null;
    }
   }

    // addNext will add the new node to the end of the list
    public void addNext(int data) {
        // Create New Node 
        Node newNode = new Node(data);
        
        // check if its a first node element
        if (head ==null) {  
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    // 10 --> 20 --> 30 TO 1 --> 10 --> 20 --> 30
    public void prepend( int data) {
        Node newNode = new Node(data);

        if (this.head != null) {
            newNode.next = this.head;
            this.head = newNode;
            this.triple_next = this.head.next.next.next;
        }
    }

    private static void printList() {
        Node n = head;

        while (n !=null ) {
            System.out.print("[ " + n.data + " ]");
            // System.out.print("[ " + n.triple_next.data+ " ]");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String arg[]) {
       TripleNextLinkedList linkedList  = new TripleNextLinkedList();
        linkedList.addNext(10);
       // printList();
        linkedList.addNext(20);
       // printList();
        linkedList.addNext(30);
        //printList();
        linkedList.prepend(1);
        printList();
        /*
        SinglyLinkedList firstHead = new SinglyLinkedList();
        firstHead.head = new Node(10);
        
        Node secondHead = new Node(20);
        Node thirdHead = new Node(30);
        
        firstHead.head.tail = secondHead;
        secondHead.tail = thirdHead;
        printList();
        */

    }

}
