package Practice;

public class IntToBinary {
    public static void main(String[] args) {
        int num = 8;
        int rem, binary = 0, j = 1;
        while(num > 0){
            rem = num % 2;
            binary = (rem * j) + binary;
            num = num/2;
            j = j * 10;
        }
        System.out.println(binary);
    }
}
