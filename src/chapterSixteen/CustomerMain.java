package chapterSixteen;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Idris",3_000_000.00);
        Customer customerOne = new Customer(4, "Green",5_000_000.00);
        Customer customerTwo = new Customer(7, "Femi",1_000_000.00);

        Comparator<Customer> comparator = (c1, c2) -> {
            if(c1.getId()>c2.getId()) return 1;
            else if (c2.getId()>c1.getId()) return  -1;
            return 0;
        };

        Set<Customer> customers = new TreeSet<>(comparator);
        customers.add(customerOne);
        customers.add(customer);
        customers.add(customerTwo);

        System.out.println(customers);
    }

}
