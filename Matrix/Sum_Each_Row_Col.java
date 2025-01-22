class Sum_Each_Row_Col {
    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // sum of each rows
        for (int i = 0; i < 3; i++) {
            System.out.print("Sum of " + i + "th row is ");
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += numbers[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
        System.out.println();
        // sum of each columns
        for (int i = 0; i < 3; i++) {
            System.out.print("Sum of " + i + "th column is ");
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += numbers[j][i];
            }
            System.out.print(sum);
            System.out.println();
        }

    }
}
