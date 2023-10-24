package GFG.LinkLists;

public class DoublyLinkList {
    //doubly-link-List
    static class Node {
        Node next, prev;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    //Insert at begin
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    //Insert At last
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        //check Link-list exist or not
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //insert At position
    public void insertAtPosition(int data, int posData) {
        Node newNode = new Node(data);
        Node temp = head;
        Node ptr = head.next;

        if (head == null) {
            System.out.println("No Element available");
        } else {
            while (temp.data != posData) {
                temp = temp.next;
                ptr = ptr.next;
            }
            newNode.prev = temp;
            newNode.next = ptr;
            temp.next = newNode;
            ptr.prev = newNode;
        }
    }

    //Delete Node at Begin
    public void deleteAtBegin() {
        if (head == null) {
            System.out.println("first enter Node");
        } else {
            head.prev = null;
            head = head.next;

        }
    }

    //Delete Node at end
    public void deleteEnd(){

        if (head == null) {
            System.out.println("first enter Node");
        } else {
            Node temp = tail;
            Node ptr = temp.prev;
            ptr.next = null;
            temp.prev = null;
            tail = ptr;
        }
    }

    //Delete Node at specific Position
    public void deleteAtPos(int posData){
        if (head == null) {
            System.out.println("enter first node");
        } else {
            Node previousPointer = head;
            Node currentPointer = head.next;

            while (currentPointer.data != posData) {
                previousPointer = currentPointer;
                currentPointer = currentPointer.next;
            }
            previousPointer.next = currentPointer.next;
            currentPointer.next.prev = previousPointer;
        }
    }


    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("No Element available");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkList doublyLinkList = new DoublyLinkList();
        doublyLinkList.insertAtBegin(0);
        doublyLinkList.insertAtBegin(1);
        doublyLinkList.insertAtBegin(2);
        doublyLinkList.insertAtBegin(3);
        doublyLinkList.insertAtBegin(4);

        doublyLinkList.display();
        doublyLinkList.insertAtEnd(-1);
        doublyLinkList.insertAtEnd(-2);
        doublyLinkList.insertAtEnd(-3);
        doublyLinkList.insertAtEnd(-4);
        System.out.println();
        doublyLinkList.display();

        doublyLinkList.insertAtPosition(10, -1);
        doublyLinkList.insertAtPosition(12, 0);
        doublyLinkList.deleteAtBegin();
        doublyLinkList.deleteAtBegin();
        doublyLinkList.deleteEnd();
        doublyLinkList.deleteEnd();

        System.out.println();
        doublyLinkList.display();
        doublyLinkList.deleteAtPos(12);
        System.out.println();
        doublyLinkList.display();
    }
}
