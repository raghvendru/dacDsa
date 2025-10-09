package Queue;

public class LinearQueue {
    int front, rear, capacity;
    int[] arr;

    public LinearQueue(int capacity1) {
        capacity = capacity1;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        arr[++rear] = item;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println("Dequeued: " + arr[front]);
        front++;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element: " + arr[front]);
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.peek();
    }
}
