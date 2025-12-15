public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize the queue
    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
        count = 0;
    }
    public boolean isFull() {
        return (count == capacity);
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public int size() {
        return count;
    }

    // implement enqueue method
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        // If queue is empty, set front to 0
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
        System.out.println(item + " enqueued to the queue");}

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = arr[front];
        if (front == rear){   // only 1 element in queue
            front = -1;
            rear = -1;  
        }else{
            front = (front + 1) % capacity;
        }
        count--;
        System.out.println(item + " dequeued from the queue");
        return item;}

        // implement front method to get front element of the queue
        public int front() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[front];
        }

        // method to get rear element of the queue
        public int rear() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[rear];
        }

        //display the queue
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Elements in Circular Queue are: ");
            int i = front;
            do {
                System.out.print(arr[i] + " ");
                i = (i + 1) % capacity;
            } while (i != (rear + 1) % capacity);
            System.out.println();
        }

        public static void main(String[] args) {
            Queue queue = new Queue(5);
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.display();
    
            System.out.println("Dequeued: " + queue.dequeue());
            queue.display();
    
            queue.enqueue(4);
            queue.enqueue(5);
            queue.enqueue(6);
            queue.display();
    
            System.out.println("Front element: " + queue.front());
            System.out.println("Rear element: " + queue.rear());
        }

    

}
