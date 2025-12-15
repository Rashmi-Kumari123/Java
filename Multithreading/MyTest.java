public class MyTest {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Thread t1 = new Thread(obj, "t1");
        Thread t2 = new Thread(obj, "t2");
        Thread t3 = new Thread(obj, "t3");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
