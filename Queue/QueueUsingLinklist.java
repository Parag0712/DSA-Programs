package GFG.Queue;

public class QueueUsingLinklist {
    static class Node{
         int data;
         Node next;
         public Node(int data){
             this.data = data;
             this.next = null;
         }
    }
         Node front = null;
         Node rear = null;

    //enqueue
    public void enqueue(int data){
        Node newNode = new Node(data);
        if (front ==null){
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    //dequeue
    public void dequeue(){
        if (front ==null ){
            System.out.println("Stack is underfloe");
        }else {
            front = front.next;
        }
    }

    //display queue
    public void display(){
        if (front ==null ){
            System.out.println("Stack is underfloe");
        }else {
            Node temp = front;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueUsingLinklist queueLinklist = new QueueUsingLinklist();
        queueLinklist.enqueue(0);
        queueLinklist.enqueue(1);
        queueLinklist.enqueue(2);
        queueLinklist.enqueue(3);
        queueLinklist.enqueue(4);

        queueLinklist.display();
        queueLinklist.dequeue();
        queueLinklist.display();

        queueLinklist.dequeue();
        queueLinklist.display();

        queueLinklist.enqueue(12);
        queueLinklist.enqueue(11);
        queueLinklist.display();
    }
}
