import java.util.Scanner;

public class Matrix {
    private int[][] matrix;
    private int rows;
    private int columns;

    // Constructor
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }
    // Method to create the matrix
    public void createMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter element at position (%d, %d): ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    // Method to print the matrix
    public void printMatrix() {
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        Matrix matrix = new Matrix(rows, columns);
        matrix.createMatrix();
        matrix.printMatrix();
        scanner.close();
    }
}
