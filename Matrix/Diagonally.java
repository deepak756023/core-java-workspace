
class Diagonally {
    public static void main(String[] args) {

        int matrix[][] = { { 3, 7, 9 }, { 2, 1, 5 }, { 8, 6, 4 } };
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int row = 0; row < rows; row++) {
            int i = row, j = 0;
            while (i >= 0 && j < cols) {
                System.out.print(matrix[i][j] + "\n");
                i--;
                j++;
            }

        }

        for (int col = 1; col < cols; col++) {
            int i = rows - 1, j = col;
            while (i >= 0 && j < cols) {
                System.out.print(matrix[i][j] + "\n");
                i--;
                j++;
            }

        }

    }
}
