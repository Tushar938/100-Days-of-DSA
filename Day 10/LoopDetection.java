import java.util.Scanner;

class Node{
    protected int data = 0;
    protected Node next = null;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
class LinkedList{
    private static Node start = null;

    public static void InsertAtBeginning(int data){
        Node temp = new Node(data, start);
        start = temp;
        Display();
    }

    public static void InsertAtEnd(int data){
        if(start == null){
            start = new Node(data, null);
            return;
        }
        Node temp = start;
        while(temp.next!=null)
            temp = temp.next;
        Node node = new Node(data, null);
        temp.next = node;
        //Display();
    }
    public static void InsertAfterAnElement(int data1, int data2){
        Node temp = start;
        while(temp.data!=data2)
            temp = temp.next;
        Node node = new Node(data1, temp.next);
        temp.next = node;
        Display();
    }
    public static void InsertBeforeAnElement(int data1, int data2){
        Node temp = start;
        while(temp.next.data!=data2)
            temp = temp.next;
        Node node = new Node(data1, temp.next);
        temp.next = node;
        Display();
    }

    public static void DeleteAtBeginning(){
        if(start == null)
            System.out.println("LinkedList is already Empty!!!");
        else    
            start = start.next;
        Display();        
    }
    
    public static void DeleteAtEnd(){
        if(start == null)
            System.out.println("LinkedList is already Empty!!!");
        else{
            Node temp = start;
            while(temp.next.next!=null)
                temp = temp.next;
            temp.next = null;
        }
        Display(); 
    }

    public static void DeleteAfterAnElement(int data){
        if(start == null)
            System.out.println("LinkedList is already Empty!!!");
        else{
            Node temp = start;
            while(temp.data!=0)
                temp = temp.next;
            temp.next = temp.next.next;
        }
        Display(); 
    }

    public static void DeleteBeforeAnElement(int data){
        if(start == null)
            System.out.println("LinkedList is already Empty!!!");
        else{
            Node temp = start;
            while(temp.next.next.data!=0)
                temp = temp.next;
            temp.next = temp.next.next;
        }
        Display(); 
    }

    public static void DeleteAnElement(int data){
        if(start == null)
            System.out.println("LinkedList is already Empty!!!");
        else{
            Node temp = start;
            while(temp.next.data!=0)
                temp = temp.next;
            temp.next = temp.next.next;
        }
        Display(); 
    }

    public static void Display(){
        if(start == null){
            System.out.println("LinkedList is empty!!!");
            return;
        }
        Node temp = start;
        while(temp!=null){
            System.out.print(" --> "+temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void CycleFormation(){
        Node temp = start;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = start; 
    }
    public static boolean CycleDetection(){
        Node tortoise = start;
        Node rabbit = start;
        while(rabbit.next!=null){
            if(rabbit == tortoise)
                return true;
            else{
                rabbit = rabbit.next.next;
                tortoise = tortoise.next;
            }
        }
        return false;
    }
}
public class LoopDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList.InsertAtEnd(1);
        LinkedList.InsertAtEnd(2);
        LinkedList.InsertAtEnd(3);
        LinkedList.InsertAtEnd(4);
        System.out.println("LinkedList before Cycle Formation: ");
        LinkedList.Display();
        LinkedList.CycleFormation();
        if(LinkedList.CycleDetection())
            System.out.println("Cycle Exists");
        else
            System.out.println("Cycle doesn't exist");
    }
}
