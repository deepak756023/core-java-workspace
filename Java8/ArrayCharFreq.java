
import java.util.stream.*;
import java.util.function.Function;
import java.util.*;

class ArrayCharFreq {
    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'd', 'c', 'd', 'g', 'a', 'a'};

        Character[] characterArray = new Character[characters.length];
        for (int i = 0; i < characters.length; i++) {
            characterArray[i] = characters[i]; // Convert char to Character
        }

        var freq = Arrays.stream(characterArray)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freq);

    }
}
