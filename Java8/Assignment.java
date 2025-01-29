import java.util.Comparator;
import java.util.List;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Assignment {
    public void secondLargrst(List<Integer> numbers) {
        //List<Integer> numbers = List.of(3, 5, 6, 9, 7, 12);

        numbers.stream()
                .filter(n -> n % 3 == 0)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(n -> System.out.println(n));
    }

    public void age(LocalDate birthDay) {


        LocalDate today = LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birthDay, today));
    }

    public void freqCharString(List<String> names) {
       // List<String> names = List.of("Deepak Nayak", "Swaraj Mishra", "Saroj Kumar Nayak");

        names.stream()
                .map(name -> name
                        .chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                )
                .forEach(System.out::println);

    }

    public void anagram(String name1, String name2) {

        var list = name1.toUpperCase().chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .collect(Collectors.toList());
        // System.out.println(list);

        var list1 = name2.toUpperCase().chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .collect(Collectors.toList());
        // System.out.println(list1);

        if (list.equals(list1)) {
            System.out.println("Its a Anagram");
        } else {
            System.out.println("Not Anagram");
        }


    }
}

class AssignMain {
    public static void main(String[] args) {
        Assignment assign1 = new Assignment();
        assign1.age(LocalDate.of(2001, 02, 24));
        assign1.anagram("Deepfake", "fakedeep");
        assign1.freqCharString(List.of("Deepak Nayak", "Swaraj Mishra", "Saroj Kumar Nayak"));
        assign1.secondLargrst(List.of(3, 5, 6, 9, 7, 12));
    }

}
