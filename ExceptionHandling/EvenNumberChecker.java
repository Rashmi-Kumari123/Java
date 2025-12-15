public class EvenNumberChecker {
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Error: " + number + " is an odd number.");
        }
        System.out.println(number + " is an even number.");
    }
    public static void main(String[] args) {
        try {
            checkEven(4);
            checkEven(7);
        } catch (OddNumberException e) {
            e.printStackTrace();;
        }
    }
}
