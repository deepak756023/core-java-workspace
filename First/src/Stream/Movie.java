package Stream;

import java.util.Comparator;

public class Movie implements Comparator<Movie> {
    private String name;
    private int likes;

    public Movie(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compare(Movie o1, Movie o2) {
        return 0;
    }

    @Override
    public String toString() {
        return name ;
    }


}
