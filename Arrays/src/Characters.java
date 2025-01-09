import java.util.Arrays;
public class Characters {
    public static void main(String[] args) {

        char[] characters = {'a', 'f', 'j', 'd'};
        System.out.println(Arrays.toString(characters));

        for(int i = 0; i < characters.length; i++){
            System.out.println(characters[i]);
        }

        Arrays.sort(characters);
        System.out.println(Arrays.toString(characters));

    }
}
