package datastructures;

// Implement Circular Queue using Array
public class CircularQ {

    private int[] arr;
    private int size;
    private int front;
    private int rear;

    // Constructor
    public CircularQ(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Queue size must be greater than 0");
        }

        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    // Check if queue is full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Enqueue operation
    public void add(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        // First element insertion
        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    // Dequeue operation
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int result = arr[front];

        // Single element condition
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return result;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    // Driver code
    public static void main(String[] args) {

        CircularQ q = new CircularQ(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Queue elements:");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}