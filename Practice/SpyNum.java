package Practice;

public class SpyNum {
    public static void main(String[] args) {
        int num = 1124;
        int sum = 0, product = 1, rem;
        while (num > 0) {
            rem = num % 10;
            sum += rem;
            product *= rem;
            num /= 10;
        }
        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }
    }
}
