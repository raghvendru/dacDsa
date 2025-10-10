package Queue;

public class PriorirtyQueue {
    int[] arr;
    int size, capacity;

    public PriorirtyQueue(int capacity1) {
        capacity = capacity1;
        arr = new int[capacity];
        size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }

        int i;
        for (i = size - 1; i >= 0 && arr[i] > item; i--) {
            arr[i + 1] = arr[i];
        }
        arr[i + 1] = item;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println("Dequeued (highest priority): " + arr[0]);
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Highest priority element: " + arr[0]);
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
    	PriorirtyQueue pq = new PriorirtyQueue(5);
        pq.enqueue(30);
        pq.enqueue(10);
        pq.enqueue(20);
        pq.enqueue(5);
        pq.peek();
        pq.dequeue();
        pq.peek();
    }
}
