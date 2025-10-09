package Queue;

public class CircularQueue {
    int front, rear, size, capacity;
    int[] arr;

    public CircularQueue(int capacity1) {
        capacity = capacity1;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println("Dequeued: " + arr[front]);
        front = (front + 1) % capacity;
        size--;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element: " + arr[front]);
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); 
        q.peek();
    }
}
