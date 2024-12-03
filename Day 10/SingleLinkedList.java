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
        Node temp = start;
        while(temp.next!=null)
            temp = temp.next;
        Node node = new Node(data, null);
        temp.next = node;
        Display();
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
}
public class SingleLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("What action would you like to perform:\n1. Insertion\n2. Deletion\n3. Display");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("Where would you like to insert:\n1. Beginning\n2. End\n3. After an element\n4. Before an element");
                    switch(sc.nextInt()){
                        case 1:
                            System.out.print("Emter the data: ");
                            LinkedList.InsertAtBeginning(sc.nextInt());
                            break;
                        case 2:
                            System.out.print("Enter the data: ");
                            LinkedList.InsertAtEnd(sc.nextInt());
                            break;
                        case 3:
                            System.out.print("Enter the data of the node after which you want to Insert your Node: ");
                            int data = sc.nextInt();
                            System.out.println("Enter the data: ");
                            LinkedList.InsertAfterAnElement(sc.nextInt(), data);
                            break;
                        case 4:
                            System.out.print("Enter the data of the node before which you want to Insert your Node: ");
                            data = sc.nextInt();
                            System.out.println("Enter the data: ");
                            LinkedList.InsertBeforeAnElement(sc.nextInt(), data);
                            break;
                        default:
                            System.out.println("Invalid Input!!!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Which element would you like to delete:\n1. First\n2. Last\n3. After an element\n4. Before an element\n5. Giving its data");
                    switch(sc.nextInt()){
                        case 1:
                            LinkedList.DeleteAtBeginning();
                            break;
                        case 2:
                            LinkedList.DeleteAtEnd();
                            break;
                        case 3:
                            System.out.println("Enter the element whose next element you want to delete");
                            LinkedList.DeleteAfterAnElement(sc.nextInt());
                            break;
                        case 4:
                            System.out.println("Enter the element whose previous element you want to delete");
                            LinkedList.DeleteBeforeAnElement(sc.nextInt());
                            break;
                        case 5:
                            System.out.print("Enter the data of the Node you want ot delete: ");
                            LinkedList.DeleteAnElement(sc.nextInt());
                            break;
                        default:
                            System.out.println("Invalid Input!!!");
                            break;
                    }
                    break;
                case 3:
                    LinkedList.Display();
                    break;
                case 4:
                    System.out.println("Invalid Input!!!");
                    break;
            }    
        }
    }
}
