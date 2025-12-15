import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): "); // Input array size
        int n = scanner.nextInt();
        
        int[] arr = new int[n];  // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        bubbleSort(arr);    // Perform bubble sort
        System.out.println("Sorted array:");   // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = n - 1; i >= 0; i--) {
            swapped = false;
            for (int j = 0; j < i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swapping occurred, array is already sorted
            if (!swapped) {
                System.out.println("Early termination: Array is already sorted.");
                break;
            }
        }
    }
}
