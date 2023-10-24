package GFG.Stack;

public class StackUsingLinkList {
    static class Node{
    int data;
    Node next;
        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    Node top = null;

    //push using link-list
    public void push(int data){
        Node newNode = new Node(data);
        if (top == null){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
    }

    //push using link-list
    public void pop(){
        if (top == null){
            System.out.println("Stack is UnderFLow");
        }else {
            top = top.next;
        }
    }

    //display stack\
    public void display(){
        if (top ==null){
            System.out.println("stack underflow");
        }else {
            Node temp = top;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        StackUsingLinkList stackUsingArray = new StackUsingLinkList();
        stackUsingArray.push(1);
        stackUsingArray.push(2);
        stackUsingArray.push(3);
        stackUsingArray.display();
        System.out.println();
        //pop 3,2
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.display();
    }
}
