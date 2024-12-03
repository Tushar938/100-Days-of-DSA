import java.util.Scanner;
import java.util.Stack;

class MyStack{
    static Stack stack = new Stack();
    static Stack min = new Stack();

    public static void Push(int num){
        if(stack.isEmpty() || num<=Integer.parseInt(min.peek().toString()))
            min.push(num);
        stack.push(num);
    }
    public static void Pop(){
        if(stack.isEmpty())
            System.out.println("Stack is Empty");
        else{
            int num = Integer.parseInt(stack.peek().toString());
            stack.pop();
            if(num==Integer.parseInt(stack.peek().toString()));
                min.pop();
        }
    }
    public static void Top(){
        System.out.println("Element at the top is: ".concat(stack.peek().toString()));
    }
    public static void Min(){
        System.out.println("Smallest Number in the Stack is: ".concat(min.peek().toString()));
    }
} 
public class SmallestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("What action do you want to perform:\n1. Push\n2. Pop\n3. Top\n4. Get Smallest Number");
            int num = sc.nextInt();
            switch(num){
                case 1:
                    System.out.print("Enter the number you want to push: ");
                    MyStack.Push(sc.nextInt());
                    break;
                case 2:
                    MyStack.Pop();
                    break;
                case 3:
                    MyStack.Top();
                    break;
                case 4:
                    MyStack.Min();
                    break;
                default:
                    System.out.println("Invalid Input!!!!");
                    break;
        }}
    }
}