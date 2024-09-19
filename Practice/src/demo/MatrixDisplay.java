package demo;

import java.util.Scanner;

public class MatrixDisplay {
	
	
	
	

    // Function to input and return the NxN matrix
    public static int[][] inputMatrix(int n) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Function to display the matrix row-wise
    public static void displayRowWise(int[][] matrix) {
        System.out.println("Matrix displayed row-wise:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to display the matrix column-wise
    public static void displayColumnWise(int[][] matrix) {
        System.out.println("Matrix displayed column-wise:");
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the matrix
        System.out.print("Enter the size (N) of the NxN matrix: ");
        int n = scanner.nextInt();
        
        // Input the matrix elements
        int[][] matrix = inputMatrix(n);
        
        // Display the matrix row-wise
        displayRowWise(matrix);
        
        // Display the matrix column-wise
        displayColumnWise(matrix);
    }
}
