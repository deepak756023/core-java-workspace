package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {
    private String n; // Movie name
    private double r; // Movie rating
    private int y;    // Movie year

    // Constructor to initialize movie details
    public Movie(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    // Getter methods
    public String getN() {
        return n;
    }
    public double getR() {
        return r;
    }
    public int getY() {
        return y;
    }
}

// Comparator to sort movies by rating
class Rating implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {

        // Sort by rating in descending order
        if(m2.getR() == m1.getR()) {
            if(m2.getY() == m1.getY())
                return 0;
            else if(m2.getY() > m1.getY())
                return 1;
            else
                return -1;
        }
        else if(m2.getR() > m1.getR())
            return 1;
        else
            return -1;
    }
}



// Main class
public class real {
    public static void main(String[] args) {

        // Create a list of movies
        ArrayList<Movie> m = new ArrayList<>();
        m.add(new Movie("Force Awakens", 8.3, 2015));
        m.add(new Movie("Star Wars", 8.3, 2077));
        m.add(new Movie("Empire Strikes Back", 8.8, 1980));

        // Sort movies by rating and display all
        Collections.sort(m, new Rating());
        System.out.println("Movies sorted by rating:");
        for (Movie m1 : m) {
            System.out.println(m1.getR() + " " + m1.getN() + " " + m1.getY());
        }

    }
}
