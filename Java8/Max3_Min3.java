import java.util.*;
import java.util.stream.*;

class Max3_Min3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 5, 8, 3, 87, 4, 7, 2, 8, 23);
        System.out.println("-------------max3-------------");
        numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-------------min3-------------");

        numbers.stream()
                .distinct()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}
