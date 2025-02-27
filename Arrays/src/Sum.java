import java.util.*;
public class Sum {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 6, 8};
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
