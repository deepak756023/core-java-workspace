public class Duplicate {
    public static void main(String[] args) {
        int[] numbers = { 1024, 4, 57, 78, 45, 84, 976, 84, 4, 1024};

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println(numbers[i]);
                    break;
                }
            }

        }
    }
}
