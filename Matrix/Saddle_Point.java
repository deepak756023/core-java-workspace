class Saddle_Point {
    public static void main(String[] args) {
        // matrix must be a square matrix
        int matrix[][] = {
                { 10, 3, 18, 15, 1 },
                { 12, 10, 24, 21, 18 },
                { 7, 6, 17, 10, 22 },
                { 3, 2, 6, 8, 4 },
                { 12, 8, 10, 12, 15 }
        };
        // saddle point that is the minimum (or smallest) element row-wise and maximum
        // (or largest) element column-wise
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] != 0) {
                    int count = 0;
                    for (int k = 0; k < 5; k++) {
                        if (matrix[i][j] < matrix[i][k] && j != k) {
                            count++;
                        }
                        if (matrix[i][j] > matrix[k][j] && i != k) {
                            count++;
                        }
                    }
                    if (count == 8)
                        System.out.print("Saddle point " + matrix[i][j]);
                }
            }
        }
        System.out.println();
        // Vice-versa
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] != 0) {
                    int count = 0;
                    for (int k = 0; k < 5; k++) {
                        if (matrix[i][j] > matrix[i][k] && j != k) {
                            count++;
                        }
                        if (matrix[i][j] < matrix[k][j] && i != k) {
                            count++;
                        }
                    }
                    if (count == 8)
                        System.out.print("Saddle point " + matrix[i][j]);
                }
            }
        }

    }
}
