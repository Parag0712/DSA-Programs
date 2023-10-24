package GFG.LinkLists;

public class CircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    //insert data in circular linked-list
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
    }

    //insert at specific postion
    public void insertAtPosition(int data, int dataPosition) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
        } else {
            Node temp = head;
            while (temp.data != dataPosition) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    //delete at Begin
    public void deleteAtBegin() {
        if (head == null) {
            System.out.println("first enter Node");
        } else {
            head = head.next;
            tail.next = head;
        }

    }

    //delete at end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("first enter Node");
        } else {
            Node temp = head;
            Node ptr = temp.next;
            while (ptr.next != head) {
                temp = ptr;
                ptr = ptr.next;
            }

            temp.next = head;

            tail = temp;
        }
    }

    //delete at position
    public void deleteAtPos(int posData) {
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
        }
    }

    //display data for circular linked-list
    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("No data available");
        } else {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertAtBegin(0);
        circularLinkedList.insertAtBegin(-1);
        circularLinkedList.insertAtBegin(-2);
        circularLinkedList.insertAtBegin(-3);
        circularLinkedList.insertAtBegin(-4);

        circularLinkedList.display();
        circularLinkedList.insertAtEnd(1);
        circularLinkedList.insertAtEnd(2);
        circularLinkedList.insertAtEnd(3);
        circularLinkedList.insertAtEnd(4);
        System.out.println();
        circularLinkedList.display();

        circularLinkedList.insertAtPosition(12, -1);
//        circularLinkedList.insertAtPosition(22,2);
        circularLinkedList.deleteAtBegin();
        circularLinkedList.deleteAtBegin();

        System.out.println();
        circularLinkedList.display();
        circularLinkedList.deleteAtEnd();
        circularLinkedList.deleteAtPos(0);
        System.out.println();
        circularLinkedList.display();
    }
}
