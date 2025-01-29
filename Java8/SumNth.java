import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Stream;

public class SumNth {
    public static void main(String[] args) {
        Integer sum = Stream.iterate(1, n -> n + 1)
                .limit(10)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
