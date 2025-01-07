package Practice;

public class StringReverse {
    public static void main(String[] args){
        String s = "Deepak";
        int i;
        String rev = "";
        for(i = s.length()-1 ; i >= 0 ; i--){
            rev += s.toLowerCase().charAt(i);
        }
        System.out.println(rev);
    }
}
