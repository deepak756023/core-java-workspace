import java.util.*;
import java.util.stream.*;

class JoinComma {
    public static void main(String[] args) {
        List<String> faang = List.of("Facebook", "Apple", "Amazon", "Netflix", "Google");
        var list = faang.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(list);
    }
}
