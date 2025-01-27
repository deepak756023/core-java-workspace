import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

class Max_Min {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 8, 5, 90, 75, 9, 0, 15);
        var statistics = numbers.stream()
                .collect(Collectors.summarizingInt(n -> n));

        int max = statistics.getMax();
        int min = statistics.getMin();

        System.out.println("max = "+ max);
        System.out.println("min = "+ min);

    }
}
