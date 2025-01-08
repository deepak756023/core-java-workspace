package Practice;

public class ISBNNum {

    public static void main(String[] args) {
        long num = 8147852369L;
        long rem, j = 0;
        int sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = (int)(sum +rem * (++j));
            num = num / 10;
        }
        System.out.println(sum);
        if (sum % 11 == 0)
            System.out.println("ISBN Number");
        else
            System.out.println("not a legal ISBN");
    }
}

