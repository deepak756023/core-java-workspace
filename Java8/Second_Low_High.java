import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Second_Low_High {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(n -> System.out.println("2nd largest =  " + n));

        listOfIntegers.stream()
                .sorted()
                .skip(1)
                .limit(1)
                .forEach(n -> System.out.println("2nd lowest = " + n));
    }
}
