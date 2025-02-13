import java.util.*;
import java.util.stream.*;
//import java.function.*;

class Count_Vowels {
    public static void main(String[] args) {
        List<String> names = List.of("Deepak", "Swaraj", "Saroj");

        names.stream()
                .map(name -> name.chars()
                        .filter(n -> n == 'a')
                        .count())
                .forEach(n->{
                    System.out.println(n);
                });


    }
}
