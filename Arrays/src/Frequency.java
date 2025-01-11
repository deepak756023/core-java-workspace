import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 3, 6, 1, 0, 6, 6};
        int n = numbers.length;

        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);


        for(int i = 0; i < n; i++){
            if(visited[i] == true)
                continue;

            int count = 1;
            for(int j = i+1; j < n; j++){
                if(numbers[i] == numbers[j]){
                    visited[j] = true;
                    count++;
                }

            }
            System.out.println("frequency of "+ numbers[i]+" is " +count);


        }



    }
}
