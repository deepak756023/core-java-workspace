import java.util.stream.Collectors;
import java.util.function.Function;

class StringCharFreq {
    public static void main(String[] args) {
        String name = "Deepak Nayak";
        var frequency = name.chars()
                .mapToObj(n -> (char) n)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);

    }
}
