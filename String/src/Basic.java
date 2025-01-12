
public class Basic {
    public static void main(String[] args) {
        String name = "Deepak";
        //Printing separate character from String
        int length = name.length();// Count total numbers of character of a string
        for (int i = 0; i < length; i++) {
            System.out.println(name.charAt(i));
        }
        //Reverse a string
        String rev = "";
        for (int i = length - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        System.out.println(rev);
    }
}