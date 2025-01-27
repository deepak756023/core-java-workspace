import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class Sorted_String_Length {
    public static void main(String[] args) {
        List<String> names = List.of("Deepak", "Swaraj", "Saroj", "Muna");
        var list = names.stream()
                .sorted(Comparator.comparing(name -> name.length()))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
