package Generics;

public class User implements Comparable<User>{
    private int point;
    public User(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "point=" + point ;
    }

    @Override
    public int compareTo(User o) {
        return point-o.point;
    }
}
