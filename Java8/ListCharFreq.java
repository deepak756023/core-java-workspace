import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;
class ListCharFreq {
    public static void main(String[] args) {
        List<Character> characters = List.of('a', 'b', 'd', 'c', 'd', 'g', 'a', 'a');

        var frequency = characters.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);

    }
}
