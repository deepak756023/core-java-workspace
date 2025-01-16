
class Triangular {
    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Lower Triangular Matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < j) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(numbers[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        // Upper Triangular Matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i <= j) {
                    System.out.print(numbers[i][j] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
