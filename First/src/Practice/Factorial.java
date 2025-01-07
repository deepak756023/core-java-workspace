package Practice;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int fact = 1;
        for( int i = num ; i > 0 ; i--){
            fact *= i;
        }
        System.out.println(fact);
    }
}


