// Shared resource class containing the shared variable and synchronized methods
class SharedBuffer {
    private int data;
    private boolean isProduced = false;
    
    // Synchronized method for producing data
    synchronized void produce(int value) {
        // Wait while previously produced data hasn't been consumed
        while (isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Produce data
        data = value;
        isProduced = true;
        System.out.println("Produced: " + value);
        
        // Notify consumer that data is available
        notifyAll();
    }
    
    // Synchronized method for consuming data
    synchronized int consume(String consumerName) {
        // Wait while no data is available to consume
        while (!isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        // Consume data
        System.out.println("Consumed: " + data);
        isProduced = false;
        
        // Notify producer that buffer is empty
        notifyAll();
        return data;
    }
}





