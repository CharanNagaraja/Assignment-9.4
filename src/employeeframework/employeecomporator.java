package employeeframework;

import java.util.Comparator;

public class employeecomporator implements Comparator<employee>{
	
//Compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
	@Override
	public int compare(employee employee1, employee employee2) {
	String empName1=employee1.getName();
	String empName2=employee2.getName();
	String empDesignation1 = employee1.getDesgination();
	String empDesignation2 = employee2.getDesgination();
		
	if (empName1.compareTo(empName2)==0)//If name are same  then sort based on designation
		return empDesignation1.compareTo(empDesignation2); //Using in built method compareTo of String class
	else
			return empName1.compareTo(empName2); //Using in built method compareTo of String class
	
	
	
	}

}