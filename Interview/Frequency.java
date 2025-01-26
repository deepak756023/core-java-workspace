class Frequency {
    public static void main(String[] args) {
        String name = "Deepak Nayak";
        int length = name.length();
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            char ch = name.toLowerCase().charAt(i);
            int count = 0;
            int j = 0;
            while (j < i) {
                if (ch == name.toLowerCase().charAt(j)) {
                    count++;
                }
                j++;
            }
            int count2 = 0;
            if (count > 0 || ch == ' ') {

            } else {
                for (int k = 0; k < length; k++) {
                    if (ch == name.toLowerCase().charAt(k)) {
                        count2++;
                    }
                }
                System.out.println(ch + " " + count2);
            }
        }
    }
}