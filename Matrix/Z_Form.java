class Z_Form {
    public static void main(String[] args) {
        // matrix must be a square matrix
        int matrix[][] = {
                { 6, 3, 2, 1, 4 },
                { 7, 8, 3, 12, 9 },
                { 1, 11, 10, 5, 8 },
                { 5, 18, 6, 9, 14 },
                { 19, 23, 3, 12, 11 }
        };
        int rows = matrix.length;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    System.out.print(matrix[i][j] + "\t");
                    if (j == 4)
                        System.out.println();
                }

                if (i != 0 && i != rows - 1) {
                    if (i + j == rows - 1) {
                        System.out.print(matrix[i][j]);

                    } else {
                        System.out.print("\t");
                    }
                    if (j == 4)
                        System.out.println();

                }

                if (i == rows - 1) {
                    System.out.print(matrix[i][j] + "\t");
                }

            }
        }
    }
}
