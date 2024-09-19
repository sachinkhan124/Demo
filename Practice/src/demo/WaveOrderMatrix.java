package demo;

public class WaveOrderMatrix {

    // Function to print the matrix in wave order
    public static void printWaveOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is empty");
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Traverse through each column
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                // Print top to bottom in even columns
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else {
                // Print bottom to top in odd columns
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println("Matrix in Wave Order:");
        printWaveOrder(matrix);
    }
}
