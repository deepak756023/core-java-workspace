package Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static  void main(String[] args){
        List<Customer> customer = new ArrayList<Customer>();
        customer.add(new Customer("Deepak","deepaknayak55260"));
        customer.add(new Customer("Swaraj","swarajmishra"));
        customer.add(new Customer("Saroj","sarojkumar"));
        //previously you have only one String as input
        //but now you have to two string and sorted by other one
        Collections.sort(customer,new EmailComparator());
        System.out.println(customer);
    }
}
