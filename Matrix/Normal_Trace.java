import java.lang.Math;

class Normal_Trace {
    public static void main(String[] args) {
        // matrix must be a square matrix
        int matrix[][] = {
                { 6, 3, 2, 1, 4 },
                { 7, 8, 3, 12, 9 },
                { 1, 11, 10, 5, 8 },
                { 5, 18, 6, 9, 14 },
                { 19, 23, 3, 12, 11 }
        };
        // Normal of a matrix
        int square = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                square += Math.pow(matrix[i][j], 2);
            }
        }
        int normal = (int) Math.sqrt(square);
        System.out.println("The normal of the above matrix is " + normal);

        // Trace of a matrix
        int trace = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    trace += matrix[i][j];
                }
            }
        }
        System.out.println("The trace of the above matrix is " + trace);
    }
}
