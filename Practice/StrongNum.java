package Practice;

public class StrongNum {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int rem;
        int sum = 0;
        while (num > 0) {
            rem = num % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum += fact;
            num = num / 10;
        }
        System.out.println(sum);
        if (sum == temp)
            System.out.println("Strong Number or Krishnamurthy number");
        else
            System.out.println("Not Krishnamurthy number");
    }
}
