import java.util.*;

class Bracket {
    public static void main(String[] args) {
        String myString = "{[}](([])[)[]]";
        int length = myString.length();
        System.out.println("Length of the string: " + length);

        char[] charArray = myString.toCharArray();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (charArray[i] == '(' && charArray[j] == ')' || charArray[i] == '{' && charArray[j] == '}'
                        || charArray[i] == '[' && charArray[j] == ']') {
                    charArray[i] = ' ';
                    charArray[j] = ' ';
                    break;
                }

            }
        }
        int size = charArray.length;

        System.out.println(size);
        System.out.println(Arrays.toString(charArray));
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (charArray[i] == '(' || charArray[i] == ')' || charArray[i] == '{' || charArray[i] == '}'
                    || charArray[i] == '[' || charArray[i] == ']') {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}