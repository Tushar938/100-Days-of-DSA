import java.util.Scanner;

class Queue{
    static int[] que = new int[50];
    static int count = 0;
    public static void Enqueue(int num){
        if(count == que.length)
            System.out.println("Queue is already full");
        else{
            count++;
            que[count-1] = num;
            Peek();
        }        
    }
    public static void Dequeue(){
        if(count==0)
            System.out.println("Queue is already empty!!");
        else{
            for(int i=0; i<count-1; i++){
                que[i]=que[i+1];
                count--;
            }
        }
    }
    public static void Peek(){
        if(count==0)
            System.out.println("Queue is empty!!!");
        else    
            System.out.println("First Element is: "+que[count-1]);
    }
}
public class QueueImplementation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("What action do you want to perform:\n1. Enqueue\n2. Dequeue\n3. Peek");
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
                    Queue.Peek();
                    break;
                default:
                    System.out.println("Invalid Input!!!!");
                    break;
            }
        }
    }
}