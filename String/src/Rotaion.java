public class Rotaion {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";
        if (str1.length() != str2.length()) {
            System.out.println("Second string is not a rotation of first string because of different length");
            return;
        }
        String add = str1.concat(str1);
        System.out.println(add);
        if (add.indexOf(str2) != -1) {
            System.out.println("Second string is a rotation of first string");
        } else {
            System.out.println("Second string is not a rotation of first string");
        }
    }
}
