import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static String divide(double a, double b) {
        if (b == 0) {
            return "Error: Division by zero";
        }
        return String.valueOf(a / b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        String result;
        if (op == '+') {
            result = String.valueOf(add(num1, num2));
        } else if (op == '-') {
            result = String.valueOf(subtract(num1, num2));
        } else if (op == '*') {
            result = String.valueOf(multiply(num1, num2));
        } else if (op == '/') {
            result = divide(num1, num2);
        } else {
            result = "Invalid operator";
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}