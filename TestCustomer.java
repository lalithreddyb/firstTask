package customer;

import java.util.Collections;
import java.util.ArrayList;
//import java.lang.Comparable;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1 = new Customer(1 , "Matt", "matt@gmail.com", 1993/03/01 , "Cleveland");
		Customer customer2 = new Customer(2 , "Bart", "bart@gmail.com", 19983/02/05 , "Chicago");
		Customer customer3 = new Customer(3 , "Steve", "steve@gmail.com", 1975/04/12 , "New York");
		Customer customer4 = new Customer(4 , "Conner", "conner@gmail.com", 1997/10/25 , "Cleveland");
		Customer customer5 = new Customer(5 , "Hope", "hope@gmail.com", 1965/02/03 , "Cleveland");
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		//adding customers to customerList
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
				
		//list before sorting
		System.out.println("list before sorting");
		for (Customer customerBeforeSort : customerList) {
			System.out.println(customerBeforeSort.getName());
		}
		
		Collections.sort(customerList);
		
		//list after sorting
		System.out.println("list after sorting");
		for (Customer customerAfterSort : customerList) {
			System.out.println(customerAfterSort.getName());
		}
		
		//after overriding toString method
		System.out.println("after overriding toString method");
		for (Customer customerNew : customerList) { 
			System.out.println(customerNew);
		}
		
		System.out.println(customer1.equals(customer2)); 
	}

}
