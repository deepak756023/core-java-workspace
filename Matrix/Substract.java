class Substract {
    public static void main(String[] args) {
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] matrix2 = {
                { 6, 8, 2 },
                { 3, 9, 4 },
                { 4, 8, 1 }
        };

        if (matrix1.length != matrix2.length) {
            System.out.println("matrix rows size not same");
            return;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                System.out.println("matrix columns size not same");
                return;
            }
        }
        int m = matrix1.length;
        int n = matrix1[0].length;
        int[][] substract = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                substract[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(substract[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println(Arrays.deepToString(sum));
    }
}
