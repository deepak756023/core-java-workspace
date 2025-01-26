import java.util.*;

class MultipleFive {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 8, 3, 10, 9, 5);
        numbers.stream()
                .filter(n -> n % 5 == 0)
                .forEach(System.out :: println);
    }
}
