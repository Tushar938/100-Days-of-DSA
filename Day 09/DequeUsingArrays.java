import java.util.Scanner;

public class DequeUsingArrays {
    private int[] deque;
    private int front, rear, size;
    private static final int CAPACITY = 50;

    public DequeUsingArrays() {
        deque = new int[CAPACITY];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == CAPACITY;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertFront(int value) {
        if (isFull()) {
            System.out.println("Deque is full! Cannot insert element at the front.");
            return;
        }
        if (front == -1) { 
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + CAPACITY) % CAPACITY;
        }
        deque[front] = value;
        size++;
    }

    public void insertRear(int value) {
        if (isFull()) {
            System.out.println("Deque is full! Cannot insert element at the rear.");
            return;
        }
        if (rear == -1) { 
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % CAPACITY;
        }
        deque[rear] = value;
        size++;
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot remove element from the front.");
            return;
        }
        front = (front + 1) % CAPACITY;
        size--;
    }

    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot remove element from the rear.");
            return;
        }
        rear = (rear - 1 + CAPACITY) % CAPACITY;
        size--;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        return deque[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        return deque[rear];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }
        System.out.print("Deque: ");
        int i = front;
        for (int j = 0; j < size; j++) {
            System.out.print(deque[i] + " ");
            i = (i + 1) % CAPACITY;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DequeUsingArrays deque = new DequeUsingArrays();
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("What action do you want to perform:\n1. Insert Rear\n2. Insert Front\n3. Delete Front\n4. Delete Rear\n5. Display");
            int num = sc.nextInt();
            switch(num){
                case 1:
                    System.out.print("Enter element you want to insert:");
                    deque.insertRear(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter element you want to insert:");
                    deque.insertFront(sc.nextInt());
                    break;
                case 3:
                    deque.deleteFront();
                    break;
                case 4:
                    deque.deleteRear();
                    break;
                case 5:
                    deque.display();
                    break;
                default:
                    System.out.println("Invalid Operation!!!");
                    break;
            }
        }
    }
}