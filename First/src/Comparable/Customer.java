package Comparable;

public class Customer implements Comparable<Customer> {
      private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer other) {
        return name.compareTo(other.name);
    }
    //[Comparable.Customer@5f184fc6, Comparable.Customer@3feba861, Comparable.Customer@5b480cf9]

    @Override
    public String toString() {
        return "name='" + name;
    }
    //[name='Deepak, name='Saroj, name='Swaraj]
}
