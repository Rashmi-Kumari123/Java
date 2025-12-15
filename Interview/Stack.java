public class Stack {
    private int[] stackArray = new int[100];
    private int top = -1;

    public void push(int value){
        if(top == stackArray.length - 1){
            System.out.println("Stack Overflow: Cannot add " + value + ", stack is full.");
        }else{
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    public int pop(){
        if (top == -1){
            System.out.println("Stack Underflow: Cannot pop, stack is empty.");
            return -1;
        }else{
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        }
    }

    public int peek(){
        if (top == -1) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
    }else{
        System.out.println("Top Element: " + stackArray[top]);
        return stackArray[top];
    }}

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == stackArray.length -1;
    } 

}
