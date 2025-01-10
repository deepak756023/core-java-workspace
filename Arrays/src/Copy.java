import java.util.Arrays;
public class Copy {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 3, 6, 1, 4, 8 };
        int n = numbers.length;
        int[] copy = new int[n];
        for(int i = 0; i < n; i++){
            copy[i] = numbers[i];
        }
        System.out.println(Arrays.toString(copy));
    }
}
