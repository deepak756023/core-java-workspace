import java.util.*;
import java.util.stream.*;

class Palindrome {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String name = "abcdcbab";
        var result = IntStream.range(0, name.length()/2)
                .allMatch(i -> name.charAt(i) == name.charAt(name.length() - i - 1));
        System.out.println("palindrome = " + result);
    }
}
