import java.util.*;

class SortReverse {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 8, 3, 9, 5);
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out :: println);
    }
}
