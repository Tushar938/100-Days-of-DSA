import java.util.Scanner;

class Stack{
    static int[] st = new int[50];
    static int top = 0;
    public static void Push(int num){
        if(top == st.length-1)
            System.out.println("Stack is already full");
        else{
            top++;
            st[top] = num;
            Top();
        }        
    }
    public static void Pop(){
        if(top==0)
            System.out.println("Stack is already empty!!");
        else
            top--;
    }
    public static void Top(){
        if(top==0)
            System.out.println("Stack is empty!!!");
        else    
            System.out.println("Element at the top is: "+st[top]);
    }
}
public class StackImplementation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("What action do you want to perform:\n1. Push\n2. Pop\n3. Top");
            int num = sc.nextInt();
            switch(num){
                case 1:
                    System.out.print("Enter the number you want to push: ");
                    Stack.Push(sc.nextInt());
                    break;
                case 2:
                    Stack.Pop();
                    break;
                case 3:
                    Stack.Top();
                    break;
                default:
                    System.out.println("Invalid Input!!!!");
                    break;
            }
        }
    }
}