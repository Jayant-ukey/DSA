package ageneral.comparable_comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortExample {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<>();
		
		Employee e1 = new Employee(1, "Jayant", "Nagpur");
		Employee e2 = new Employee(9, "Vishal", "Pune");
		Employee e3 = new Employee(4, "Nikhil", "Mumbai");
		Employee e4 = new Employee(3, "Manish", "Chandrapur");

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		//Now it is sort using Comparable
		Collections.sort(empList); 
		
		for(Employee emp: empList) {
			System.out.println(emp);
		}
		
		//Sort using city
		System.out.println("\n Sort using city");
		Collections.sort(empList, new CityComparator());
		for(Employee emp: empList) {
			System.out.println(emp);
		}
		
		//Sort using city in reverse order
		System.out.println("\n Sort using city in reverse order");
		Collections.sort(empList, new CityComparator().reversed());
		for(Employee emp: empList) {
			System.out.println(emp);
		}
		
		
		//Sort using name in and lambda expression specially for String
		System.out.println("\n Sort using name ");
		Collections.sort(empList, (empOne, empTwo) -> empOne.getEName().compareTo(empTwo.getEName()));
		for(Employee emp: empList) {
			System.out.println(emp);
		}
		
		//Sort eid
		System.out.println("\n Sort using eid ");
		//Collections.sort(empList, (empOne, empTwo) -> empOne.getEId().compareTo(empTwo.getEId())); 
		Collections.sort(empList, (empOne, empTwo) -> empOne.getEId()- empTwo.getEId());

		for(Employee emp: empList) {
			System.out.println(emp);
		}
		
		
		//Sort using Pre-Java8 version:  anonymous class 
		System.out.println("\n Sort using eid in reverse order");
		Collections.sort(empList, new Comparator<Employee>() {
			public int compare(Employee first, Employee second) {
				return second.getEId() - first.getEId();
			}
		});

		for(Employee emp: empList) {
			System.out.println(emp);
		}
		
	}

}








