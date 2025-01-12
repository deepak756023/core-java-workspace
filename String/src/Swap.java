//swap two string variables without using third or temp variable
public class Swap {
    public static void main(String[] args) {
        String str1 = "Deepak";
        String str2 = "Nayak";
        str1 = str1+str2;
        str2 = str1.substring(0, str2.length()+1);
        str1 = str1.substring(str2.length(), str1.length());
        System.out.println(str1);
        System.out.println(str2);
    }
}
