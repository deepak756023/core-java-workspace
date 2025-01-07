package Practice;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        System.out.println("Enter the number to check");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int rev = 0;
        int rem;
        while(num > 0){
            rem = num % 10;
            rev = (rev*10) + rem;
            num = num / 10;
        }
        if(temp == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrone");
        }
    }
}
