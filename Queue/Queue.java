package GFG.Queue;

import java.util.Scanner;

public class Queue {
    int front = -1, rear = -1;
    int n = 3;
    int queue[] = new int[n];

    //enqueue function
    public void enqueue(int data) {
        if (rear == n - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                queue[rear] = data;
            } else {
                rear = rear + 1;
                queue[rear] = data;
            }
        }
    }

    //dequeue function
    public void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue Underflow");
        } else {
            front = front + 1;
        }
    }

    //display
    public void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue Underflow");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int value;
        Scanner sc = new Scanner(System.in);
        int repeat;
        Queue queue = new Queue();
        do {
            System.out.print("Press 1 for enqueue Press 2 for dequeue Press 3 for display queue: ");
            value = sc.nextInt();
            switch (value) {
                case 1:
                    System.out.print("Enter data:");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    queue.display();
                    break;
                case 2:
                    queue.dequeue();
                    queue.display();
                    break;

            }
            System.out.print("\nFor stop press 0");
            repeat = sc.nextInt();
        } while (repeat != 0);
    }
}
