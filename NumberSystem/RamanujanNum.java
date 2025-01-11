package Practice;

public class RamanujanNum {
    public static void main(String[] args) {
        int num = 81;
        int temp = num;
        int sum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        int rem2;
        int sum1 = sum;
        int rev = 0;
        while (sum > 0) {
            rem2 = sum % 10;
            rev = (rev * 10) + rem2;
            sum /= 10;
        }
        if (temp == (rev * sum1))
            System.out.println("Ramanujan Number");
        else
            System.out.println("Not a Ramanujan Number");

    }
}
