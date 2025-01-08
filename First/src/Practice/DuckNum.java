package Practice;
import java.util.Scanner;
public class DuckNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of digits");
        int n = scanner.nextInt();
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int temp = num;

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        if(count > n){
            System.out.println("Entered number is larger than "+ n +" digits");
            return;
        }
        int count2 = 0;
        if(n == count){
            while(temp > 0){
                if(temp % 10 == 0){
                    System.out.println("Duck Number");
                    count2 = 1;
                    break;
                }
                temp = temp / 10;
            }
            if(count2 == 0){
                System.out.println("Not Duck Number");
            }
        }else{
            System.out.println("Not Duck Number");
        }
    }
}
