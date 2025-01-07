package Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter n for the series");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s1 = 0;
        int s2 = 1;
        int s3;
        System.out.print(s1 + " " + s2);
        for(int i=2; i<n ; i++){
            s3 = s1 + s2;
            System.out.print(" "+ s3);
            s1 = s2;
            s2 = s3;
        }
    }

}
