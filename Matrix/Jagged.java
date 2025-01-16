

class Jagged {
    public static void main(String[] args) {
        // Matrix with Non-Uniform Dimensions (Jagged Array)
        int[][] matrix = new int[3][];
        matrix[0] = new int[] { 1, 2 };
        matrix[1] = new int[] { 3, 4, 5 };
        matrix[2] = new int[] { 6 };

        // Accessing and printing elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {// column iteration
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
