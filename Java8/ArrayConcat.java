import java.util.*;
import java.util.stream.*;

class ArrayConcat {
    public static void main(String[] args) {
        int[] numbers1 = {1, 8, 3, 10, 9, 5};
        int[] numbers2 = {4, 8, 6, 9, 0};

        int[] numbers = IntStream.concat(Arrays.stream(numbers1), Arrays.stream(numbers2))
                .sorted()
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(numbers));
    }
}
