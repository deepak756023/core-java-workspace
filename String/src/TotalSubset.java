public class TotalSubset {
    public static void main(String[] args) {
        String name = "fun";
        int length = name.length();

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.println(name.substring(i, j + 1));
            }
        }
    }
}
