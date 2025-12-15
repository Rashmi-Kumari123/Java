//import Immutable;
public class Mutable extends Immutable {
    private int realValue;
    public Mutable(int realValue){
        super(realValue);
        this.realValue = realValue;
    }
    public void setRealValue(int v){
        this.realValue = v;
    }
    public int getRealValue(){
        return realValue;
    }
    public static void main(String[] args) {
        Mutable obj = new Mutable(4);
        Immutable imObj = (Immutable)obj;  // Upcasting
        System.out.println(imObj.getValue());  // Will print 4
        obj.setRealValue(8);
       System.out.println(imObj.getValue());  // Will still print 4
    }
}

class Immutable {
    private final int value;  
    public Immutable(int value) {
       this.value = value;
    }
    public int getValue() {  
        return value;
    }
}
