import java.util.Arrays;
public class Print {
    public static void main(String[] args) {
        int[] numbers = { 4, 57, 78, 45, 84};

        //Printing Array
        System.out.println(Arrays.toString(numbers));
        //Printing elements of an Array
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //Reverse printing elements
        for(int j = numbers.length - 1; j >= 0; j--){
            System.out.println(numbers[j]);
        }

    }
}
