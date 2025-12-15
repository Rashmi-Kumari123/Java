

public class OddEven {
    public static int count = 1;
    public static final int MAX_COUNT = 10; // You can change this to print more numbers
    
    synchronized public void printEven() {
        while (count <= MAX_COUNT) {
            if (count % 2 == 0){
                System.out.println(count+" even");
                count++;
                notifyAll();
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    synchronized public void printOdd() {
        while (count <= MAX_COUNT) {
            if (count % 2 == 1){
                System.out.println(count+" odd");
                count++;
                notifyAll();
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[] args) {
        OddEven obj =  new OddEven();
        
        // Create threads
        Thread t1  = new Thread(new EvenPrint(obj));
        Thread t2  = new Thread(new OddPrint(obj));

        t1.start();  // Start odd thread first since count starts at 1
        t2.start();
    }
}
