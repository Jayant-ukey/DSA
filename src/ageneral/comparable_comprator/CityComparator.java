package ageneral.comparable_comprator;

import java.util.Comparator;

public class CityComparator implements Comparator<Employee>{

	public int compare(Employee e1, Employee e2) {
		return e1.getCity().compareTo(e2.getCity());
	}
}
