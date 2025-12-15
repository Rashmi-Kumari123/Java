public class ProducerConsumer {
    public static void main(String[] args) {
        // Create shared buffer
        SharedBuffer buffer = new SharedBuffer();
        
        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer), "Producer");
        Thread consumer1Thread = new Thread(new Consumer(buffer, "Consumer-1"), "Consumer-1");
        Thread consumer2Thread = new Thread(new Consumer(buffer, "Consumer-2"), "Consumer-2");
        
        producerThread.start();
        consumer1Thread.start();
        consumer2Thread.start();
        
        // Wait for all threads to complete
        try {
            producerThread.join();
            consumer1Thread.join();
            consumer2Thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println("All threads completed their tasks.");
    }
}
