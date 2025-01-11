package Practice;

import java.lang.Math;

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 100;

        double root = Math.sqrt(num);
        double floor = Math.floor(root);

        if (root == floor) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");

        }
    }
}
