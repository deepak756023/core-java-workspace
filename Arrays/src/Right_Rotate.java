import java.util.*;
public class Right_Rotate {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 6, 8, 3};
        int n = 3;

        int temp2;
        for(int j = 0; j < n; j++){
            int temp = numbers[numbers.length-1];
            for(int i = numbers.length-2; i >= 0 ; i--){
                numbers[i+1] = numbers[i];
            }
            numbers[0] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }

}
