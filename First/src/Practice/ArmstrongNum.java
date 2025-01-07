package Practice;

import java.lang.Math;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 53874;
        int temp1 = num;
        int temp2 = num;
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println(count);
        int rem;
        int sum = 0;
        while (temp1 > 0) {
            rem = temp1 % 10;
            sum += Math.pow(rem, count);
            temp1 = temp1 / 10;
        }
        System.out.println(sum);
        if (sum == temp2) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");

        }
    }
}
