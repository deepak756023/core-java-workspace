package Comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static  void main(String[] args){
        List<Customer> customer = new ArrayList<Customer>();
        customer.add(new Customer("Deepak"));
        customer.add(new Customer("Swaraj"));
        customer.add(new Customer("Saroj"));
        Collections.sort(customer);//Important
        System.out.println(customer);
    }
}
