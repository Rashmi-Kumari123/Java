public class DeadlockDemo {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread(new Task1(), "Thread 1").start();
        new Thread(new Task2(), "Thread 2").start();
    }

    static class Task1 implements Runnable {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Has lock1");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {}
                    synchronized (lock2) {
                    System.out.println("Thread 1: Has lock2");
                }
            }
        }
    }

    static class Task2 implements Runnable {
        @Override
        public void run() { 
            synchronized (lock2) {  
                System.out.println("Thread 2: Has lock2");
                try { 
                    Thread.sleep(100);  
                } catch (Exception e) {}
                synchronized (lock1) {
                    System.out.println("Thread 2: Has lock1");
                }
            }
        }
    }
}
