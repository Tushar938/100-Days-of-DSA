import java.util.Scanner;

class Queue{
    static int[] que = new int[50];
    static int front = 0;
    static int rear = 0;
    static int count = 0;
    public static void Enqueue(int num){
        if(count == que.length-1)
            System.out.println("Queue is already full");
        else if(rear == que.length-1){
            rear=0;
            que[rear] = num;
            count++;
        }else if (count == 0){
            que[front] = num; 
            count++;
        }else{
            rear++;
            que[rear] = num;
            count++;
        }   
        Front();
        Rear();
    }
    public static void Dequeue(){
        if(count == 0)
            System.out.println("Queue is already empty!!");
        else if(front==que.length-1){
            front = 0;
            count--;
        }else{
            front++;
            count--;
        }
        Front();
        Rear();
    }
    public static void Front(){
        if(count == 0)
            System.out.println("Queue is empty!!!");
        else    
            System.out.println("First Element is: "+que[front]);
    }
    public static void Rear(){
        if(count == 0)
            System.out.println("Queue is empty!!!");
        else    
            System.out.println("Last Element is: "+que[rear]);
    }
}
public class CircularQueueImplementation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("What action do you want to perform:\n1. Enqueue\n2. Dequeue\n3. Front\n4. Rear");
            int num = sc.nextInt();
            switch(num){
                case 1:
                    System.out.print("Enter the number you want to Insert: ");
                    Queue.Enqueue(sc.nextInt());
                    break;
                case 2:
                    Queue.Dequeue();
                    break;
                case 3:
                    Queue.Front();
                    break;
                case 4:
                    Queue.Rear();
                    break;
                default:
                    System.out.println("Invalid Input!!!!");
                    break;
            }
        }
    }
}