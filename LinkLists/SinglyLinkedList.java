package GFG.LinkLists;

public class SinglyLinkedList {

    //head
    Node head = null;

    //create Node Code
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //insert begin Node code
    public void insertBegin(int data){
        //create Node object
        Node newNode = new Node(data);

        //check link-list exist or not
        if (head==null) {
            head =newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    //Insert at end
    public void insertAtEnd(int data){
        //create Node Object
        Node newNode = new Node(data);
        Node temp = head;
        //check Link-list exist or not
        if (head==null){
            head = newNode;
        }else {
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    //Insert at Position
    public void insertAtPosition(int data,int positionData){
        Node newNode = new Node(data);
        Node temp = head;
        if (head==null){
                head=newNode;
        }else {
             while (temp.data!=positionData){
                 temp = temp.next;
             }
             newNode.next=temp.next;
             temp.next = newNode;
        }
    }


    //Delete Begin Node
    public void deleteAtBegin(){
        head = head.next;
    }

    //Delete At End
    public void deleteAtEnd(){
        Node previousPointer = head;
        Node currentPointer = head.next;

        while (currentPointer.next!=null){
            previousPointer = currentPointer;
            currentPointer = currentPointer.next;
        }
        previousPointer.next = null;
    }

    //Delete at position
    public void deleteAtPositon(int positionData){
        Node previousPointer = head;
        Node currentPointer = head.next;
        while (currentPointer.data != positionData){
            previousPointer = currentPointer;
            currentPointer = currentPointer.next;
        }
        previousPointer.next = currentPointer.next;
    }

    //Display Linked-list Data
    public void display(){
        Node Traverse = head;
        if (head != null){
            while (Traverse!=null){
                System.out.print(Traverse.data+" ");
                Traverse = Traverse.next;
            }
        }
    }

    //Main
    public static void main(String[] args) {
        SinglyLinkedList newLinkList = new SinglyLinkedList();
        newLinkList.insertBegin(0);
        newLinkList.insertBegin(-1);
        newLinkList.insertBegin(-2);
        newLinkList.insertBegin(-3);
        newLinkList.insertBegin(-4);

        newLinkList.display();
        newLinkList.insertAtEnd(1);
        newLinkList.insertAtEnd(2);
        newLinkList.insertAtEnd(3);
        newLinkList.insertAtEnd(4);
        System.out.println();
        newLinkList.display();

        newLinkList.insertAtPosition(21,-3);
        newLinkList.insertAtPosition(21,1);
        System.out.println();
        newLinkList.display();

        newLinkList.deleteAtBegin();
        newLinkList.deleteAtBegin();
        newLinkList.deleteAtEnd();
        newLinkList.deleteAtEnd();
        System.out.println();
        newLinkList.display();
        newLinkList.deleteAtPositon(0);
        newLinkList.deleteAtPositon(-1);
        System.out.println();
        newLinkList.display();

    }
}
