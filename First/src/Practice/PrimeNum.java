package Practice;

public class PrimeNum {
    public static void main(String[] args) {
        int num = 7;
        int count = 0;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count = 1;
                }
            }
            if (count == 1) {
                System.out.println("Not Prime Number");
            } else {
                System.out.println(" Prime Number");
            }
        }

    }
}
