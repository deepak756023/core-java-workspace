import java.util.*;

class Basic {
    public static void main(String[] args) {
        // Direct Initialization
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(matrix1.length);// Number of rows
        System.out.println(matrix1[0].length);// Number of columns
        // Declare and Initialize Later
        int[][] matrix = new int[3][3]; // 3x3 matrix
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // Display the matrix
        System.out.println("Matrix1 elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // initialize a matrix dynamically using loops
        int rows = 3;
        int cols = 3;
        int[][] matrix2 = new int[rows][cols];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // Display the matrix
        System.out.println(Arrays.deepToString(matrix2));
    }

}