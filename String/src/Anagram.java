//if they have the same characters with the same frequency, but the order of the characters is different. For example, “listen” and “silent”

import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "Brag";
        String str2 = "Grab";


        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not anagram");
        } else {

            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();


            Arrays.sort(string1);
            Arrays.sort(string2);


            if (Arrays.equals(string1, string2) == true) {
                System.out.println("Both the strings are anagram");
            } else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}
