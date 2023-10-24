package GFG.Stack;

class Stack{
    int top=-1;
    int n =10;
    int stack[]=new int[n];

    //push
    public void push(int data){
        if (top==(n-1)){
            System.out.println("OverFlow stack");
        }else {
            top=top+1;
            stack[top] = data;
        }
    }
    //pop
    public void pop(){
        if (top==-1){
            System.out.println("UnderFlow stack");
        }else {
            stack[top] =0;
            top=top-1;
        }
    }

    //display value
    public void display(){
        for (int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.display();
        System.out.println("----------");
        stack.push(3);
        stack.push(4);
        stack.display();
        System.out.println("----------");
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("----------");
    }
}
