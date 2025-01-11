import java.util.*;
public class Beautiful {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 6, 5};
        int n = numbers.length;
        int[] temp = new int[n];
        for(int i = 0; i < n; i++){
            temp[i] = numbers[i];
        }
        Arrays.sort(temp);

        int count = 0;
        for(int i = 1; i < n ; i++){
            if(numbers[i] <= 0 ||  numbers[i] > n || numbers[i-1] == numbers[i]){count ++;
                if(numbers[0] <= 0 && numbers[0] > n){
                    count++;
                }
            }
        }

        if(Arrays.equals(temp, numbers) || count > 0){
            System.out.println("Not Beautiful");
        }else{
            System.out.println("Beautiful");
        }


    }
}
