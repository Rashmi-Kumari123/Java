//  Static keyword checking
public class Counter {
    private static int count = 0;
    public Counter(){
        count++;
        System.out.println("constructorCount" +  " " + count);
    }
    public static int getCount(){
        return count;
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
    System.out.println(Counter.getCount());
    }
}
