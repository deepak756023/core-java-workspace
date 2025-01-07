package Comparator;

import java.util.Comparator;

public class Customer  {
    private String name;
    private String email;

    public Customer(String name,String email) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name ;
    }
}
