public class Count_Vowels_Consonants {
    public static void main(String[] args) {
        String str = "This is a really \"simple\" sentence.";
        str = str.toLowerCase();
        int vCount = 0, cCount = 0, n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount += 1;
            }
            // removing special characters + others
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("Total Vowels :" + vCount);
        System.out.println("Total Vowels :" + cCount);


    }
}
