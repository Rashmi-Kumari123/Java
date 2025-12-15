

public class StringReaderThread implements Runnable{
    private String inputString;
    private int startIndex;
    private String threadName;

    public StringReaderThread(String inputString, int startIndex, String threadName){
        this.inputString = inputString;
        this.startIndex = startIndex;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        if (startIndex < inputString.length()) {
            int endIndex = Math.min(startIndex + 3, inputString.length());
            String substring = inputString.substring(startIndex, endIndex);
            System.out.println(threadName + " reading: " + substring);
        }
    }
}
