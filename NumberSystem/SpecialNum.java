package Practice;

public class SpecialNum {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int rem;
        int sum = 0;
        while (num > 0) {
            rem = num % 10;
            int fact = 1;
            for (int i = rem; i > 0; i--) {
                fact *= i;
            }
            sum += fact;
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not Special Number");
        }
    }
}
