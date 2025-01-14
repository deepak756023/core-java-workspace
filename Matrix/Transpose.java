
class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }

        };

        // for checking eligibility
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                System.out.println("size of rows and columns are not same");
                return;
            }
        }
        // Transpose(if eligible)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
