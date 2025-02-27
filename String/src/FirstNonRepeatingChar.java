// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.lang.*;
class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String name = "Swarajs";
        char[] characters = name.toLowerCase().toCharArray();
        System.out.println(Arrays.toString(characters));

        for(int i = 0; i < characters.length; i++){
            int count = 0;
            for(int j = i+1; j < characters.length; j++){
                if(characters[i] == characters[j]){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(characters[i]);
                return;
            }
        }
    }
}
