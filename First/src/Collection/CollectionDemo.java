package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> myCollection = new ArrayList<>();
//        myCollection.add("a");
//        myCollection.add("b");
//        myCollection.add("c");
        Collections.addAll(myCollection,"a", "b", "c");//The addAll() method of java.util.Collections class is used to add all
        myCollection.remove("c");
        var containsB  = myCollection.contains("a");
        System.out.println(containsB);
//        myCollection.clear();
//        for(var item : myCollection){
//            System.out.println(item);
//        }
        System.out.println(myCollection);
        String[] stringArray = myCollection.toArray(new String[3]);
        System.out.println(stringArray[0]);
        Collection<String> other = new ArrayList<>();
        other.add("c");

        other.addAll(myCollection);//adding two myCollection
        other.add("d");
        System.out.println(myCollection == other);
        System.out.println(myCollection.equals(other));
        System.out.println(other);
    }
}
