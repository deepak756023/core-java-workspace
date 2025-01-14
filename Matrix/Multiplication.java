
class multiplication {
    public static void main(String[] args) {
        int matrix1[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int matrix2[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

        // for checking eligibility
        if (matrix1[0].length != matrix2.length) {
            System.out.println("not eligible for multiplication");
            return;
        }

        // Multiple(if eligible)
        // int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(sum + " ");
            }

            System.out.println();
        }
    }
}
