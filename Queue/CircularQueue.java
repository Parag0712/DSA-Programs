package GFG.Queue;

public class CircularQueue {
    int front=-1 ,rear=-1;
    int n=10;
    int queue[] =new int[n];
    //enqueue
    public void enqueue(int data){
        //overflow condition
        if (front == (rear+1)%n){
            System.out.println("Queue Overflow");
        }else {
            if (front == -1 && rear == -1){
                front =0;
                rear =0;
                queue[rear] = data;
            }else {
                rear = (rear+1)%n;
                queue[rear] = data;
            }
        }
    }

    //dequeue
    public void dequeue() {
        if (front == -1 && rear == -1){
            System.out.println("queue underflow");
        }
        else if (front == rear){
            System.out.println("queue underflow");
            front =-1;
            rear =-1;
        }
        else {
            front=(front+1)%n;
        }
    }

    //display
    public void display(){
        for (int i = front;i!=rear;i=(i+1)%n){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue();
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);
        circularQueue.enqueue(5);
        circularQueue.display();
        circularQueue.dequeue();
        circularQueue.enqueue(1);
        circularQueue.enqueue(1);
        circularQueue.enqueue(1);
        circularQueue.display();
    }
}
