package Practice;

public class EvilOdiusNum {
    public static void main(String[] args) {
        int num = 8;

        String binary = Integer.toBinaryString(num);
        int n = Integer.parseInt(binary);
        System.out.println(n);

        int count = 0, rem;

        while (n > 0) {
            rem = n % 10;
            if (rem == 1) {
                count++;
            }
            n = n / 10;
        }
        if (count % 2 == 0)
            System.out.println("Evil Number");
        else
            System.out.println("Odius Number");
    }
}
