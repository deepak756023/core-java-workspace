package Practice;
import java.lang.Math;
public class AutomorphicNum {
    public static void main(String[] args) {
        int num = 625;
        int temp = num;
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        System.out.println(count);
        int rem;
        rem = (temp*temp) % (int)(Math.pow(10, count));
        System.out.println(rem);
        if(temp == rem)
            System.out.println("Automorphic number");
        else
            System.out.println("Not Automorphic");

    }
}
