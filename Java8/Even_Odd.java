import java.util.*;
import java.util.stream.Collectors;

class Even_Odd {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 7, 8, 12, 9, 13, 76, 0, 25, 6);
        System.out.println(list);

        var result = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(result);

        // Print elements through iteration
        System.out.println("------------odd numbers-------------");
        var odd = result.get(false);
        odd.forEach(System.out::println);

        //Printing in a list
        System.out.println("------------even numbers-------------");
        var even = result.get(true);
        System.out.println(even);
    }
}
