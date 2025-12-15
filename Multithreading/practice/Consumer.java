// Consumer thread class
class Consumer implements Runnable {
    private SharedBuffer buffer;
    private String name;
    
    Consumer(SharedBuffer buffer, String name) {
        this.buffer = buffer;
        this.name = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume(name);
            // try {
            //     Thread.sleep(1000);  // Simulate some processing time
            // } catch (InterruptedException e) {
            //     Thread.currentThread().interrupt();
            // }
        }
    }
}
