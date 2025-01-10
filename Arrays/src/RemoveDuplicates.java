import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 3, 6, 1, 4, 8 };
        int[] distinctArray = Arrays.stream(numbers) // Convert the array to a stream
                .distinct()       // Remove duplicates
                .toArray();
        System.out.println(Arrays.toString(distinctArray));// Print each distinct number
    }
}
