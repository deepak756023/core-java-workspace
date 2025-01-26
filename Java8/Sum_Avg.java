import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;


class Sum_Avg {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 5, 8, 3, 87, 4, 7, 2, 8, 23);
        var summery = numbers.stream()
                .collect(Collectors.summarizingInt(n -> n));
        System.out.println(summery);

        System.out.println("Sum of numbers = " + summery.getSum());

        System.out.println("Average of numbers = " + summery.getAverage());


    }
}
