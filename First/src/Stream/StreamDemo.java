package Stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("D", 10),
                new Movie("B", 15),
                new Movie("C", 20)
        );
        movies.stream()
                .filter(m -> m.getLikes()>10)
                .peek(m -> System.out.println(m.getName() + ":" + m.getLikes()))
                .forEach(n -> System.out.println(n));
        //Integer.sum(a, b);
//        Integer sum = movies.stream()
//                .map(m -> m.getLikes())
//                .reduce(0, Integer::sum);
//        System.out.println(sum);

//        movies.stream()
//                .map(movie -> movie.getLikes())
//                .distinct()
//                .forEach(n -> System.out.println(n));
//        movies.stream()
//                .sorted((a, b) -> a.getName().compareTo(b.getName()))
//                .forEach(name -> System.out.println(name));
//        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
//        stream
//                .flatMap(list -> list.stream())
//                .forEach(n -> System.out.println(n));

//        movies.stream()
//                 .map(movie -> movie.getName())
//                //.mapToInt(movie -> movie.getLikes())
//                .forEach(name -> System.out.println(name));
        //Imperative Programming(How)
//        int count1 = 0;
//        for(var movie : movies)
//            if(movie.getLikes() > 10)
//                 count1++;
//
//        //Declarative(Functional) Programming(What)
//        var count2 = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();
    }
}
