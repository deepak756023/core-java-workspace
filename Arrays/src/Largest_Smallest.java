public class Largest_Smallest {
    public static void main(String[] args) {
        int[] numbers = { 1024, 4, 57, 78, 45, 84, 976};

        //Largest element
        int max = numbers[0];
        for(int i = 1 ; i < numbers.length ; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println(max);

        //Smallest Element
        int min = numbers[0];
        for(int i = 1 ; i < numbers.length ; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(min);

    }
}
