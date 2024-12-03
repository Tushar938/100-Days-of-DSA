import java.util.*;

public class ReverseFirstKElements {

    static class MyQueue {
        int[] queue;
        int front, rear, size;
        int capacity;

        MyQueue(int capacity) {
            this.capacity = capacity;
            this.queue = new int[capacity];
            this.front = 0;
            this.rear = -1;
            this.size = 0;
        }

        void enqueue(int element) {
            if (size == capacity) {
                System.out.println("Queue is full!");
                return;
            }
            rear = (rear + 1) % capacity;
            queue[rear] = element;
            size++;
        }

        int dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int value = queue[front];
            front = (front + 1) % capacity;
            size--;
            return value;
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == capacity;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return;
            }
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseFirstKElements(MyQueue queue, int k) {
        if (queue.isEmpty() || k <= 0 || k > queue.size) {
            System.out.println("Invalid operation.");
            return;
        }

        Deque<Integer> stack = new ArrayDeque<Integer>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }

        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }

        int remaining = queue.size - k;

        for (int i = 0; i < remaining; i++) {
            queue.enqueue(queue.dequeue());
        }
        
        queue.display(); 
    }
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Original queue:");
        queue.display();
        reverseFirstKElements(queue, 3); 
    }
}
