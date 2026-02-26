import java.util.Scanner;

public class MatrixOperations {
// function to input matrices
    public static void inputMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("arr[%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
    }
//function for matrix prinitng

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
//main block
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = 3;
        int cols = 3;

        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];
        int[][] res  = new int[rows][cols];

        System.out.println("Input array 1 elements:");
        inputMatrix(arr1, sc);

        System.out.println("Input array 2 elements:");
        inputMatrix(arr2, sc);
//sum block
        System.out.println("Sum of both arrays:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
//multiplication execution block
        System.out.println("Multiplication of both arrays:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        printMatrix(res);
    }
}