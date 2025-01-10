import java.util.*;
public class SortDesc_Others {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 3, 6, 1, 4, 8 };
        int[] distinct = Arrays.stream(numbers)
                .distinct()
                .toArray();

        Arrays.sort(distinct);
        System.out.println(Arrays.toString(distinct));
        System.out.println(distinct[0]);   //Smallest
        System.out.println(distinct[1]);   //2nd Smallest
        System.out.println(distinct[distinct.length-1]); //Largest
        System.out.println(distinct[distinct.length-2]); //2nd Largest
        int n = distinct.length;
        // Sorting the array in descending order(Using same Array)
        int temp;
        for(int i = 0; i < n/2; i++){
            temp = distinct[i];
            distinct[i] = distinct[n - 1 -i];
            distinct[n-i-1] = temp;
        }
        System.out.println(Arrays.toString(distinct));

        // Sorting the array in descending order(Using another Array)
        // int[] reverse = new int[n];
        // for(int i = 0; i < n; i++){
        //     reverse[n-1-i] = distinct[i];
        // }
        // System.out.println(Arrays.toString(reverse));
    }
}
