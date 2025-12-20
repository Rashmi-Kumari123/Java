// Problem Statement:
//Create a CLI app in Java to convert units (km ↔ miles, °C ↔ °F) based on user input.
import java.util.Scanner;
public class UnitConverter {
    public static double kmToMiles(double km) {
        return km * 0.621371;
    }
    public static double milesToKm(double miles) {
        return miles / 0.621371;
    }
    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🌍 Unit Converter");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Fahrenheit to Celsius");

        System.out.print("Choose conversion (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter kilometers: ");
                double km = sc.nextDouble();
                System.out.printf("%.2f km = %.2f miles\n", km, kmToMiles(km));
                break;
            case 2:
                System.out.print("Enter miles: ");
                double miles = sc.nextDouble();
                System.out.printf("%.2f miles = %.2f km\n", miles, milesToKm(miles));
                break;
            case 3:
                System.out.print("Enter Celsius: ");
                double c = sc.nextDouble();
                System.out.printf("%.2f°C = %.2f°F\n", c, cToF(c));
                break;
            case 4:
                System.out.print("Enter Fahrenheit: ");
                double f = sc.nextDouble();
                System.out.printf("%.2f°F = %.2f°C\n", f, fToC(f));
                break;
            default:
                System.out.println("❌ Invalid choice.");
        }

        sc.close();
    }
}
