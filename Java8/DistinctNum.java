import java.util.*;
import java.util.stream.Collectors;

class DistinctNum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 8, 4, 9, 2, 8);
        // numbers.stream()
        //       .distinct()
        //         .forEach(n -> System.out.println(n));

        var distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctNumbers);


    }
}
