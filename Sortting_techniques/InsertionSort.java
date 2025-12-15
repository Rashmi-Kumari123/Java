import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
            System.out.println("After iteration " + (i+1) + ": " + Arrays.toString(arr));
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Original array: " + Arrays.toString(arr));
        insertionSort(arr, n);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        scanner.close();
    }
}
