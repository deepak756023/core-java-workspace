public class Even_Odd {
    public static void main(String[] args) {
        int[] numbers = { 1, 4 ,3 , 6, 8};
        System.out.println("Even Numbers: ");
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                System.out.println( numbers[i]);
            }
        }

        System.out.println("Odd Numbers: ");
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0){
                System.out.println( numbers[i]);
            }
        }

    }
}
