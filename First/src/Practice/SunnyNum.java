package Practice;
import java.lang.Math;
public class SunnyNum {
    public static void main(String[] args) {
        double num = 99;
        double square = Math.sqrt(num + 1);
        double floor = Math.floor(square);

        if(square == floor)
            System.out.println("Sunny Number");
        else
            System.out.println("Not Sunny Number");


    }
}
