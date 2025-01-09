import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        System.out.println("Enter the Array: ");
        int[] numbers = new int[length];
        for(int i = 0; i < length ; i++ ){
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
