package employeeframework;

import java.util.Comparator;

public class employee implements Comparable<employee>  {
private String name;
private String designation;
private double salary;

/**
 * @param name
 * @param desgination
 * @param salary
 */
public employee(String name, String designation,double salary){
	this.name = name;
	this.designation = designation;
	this.salary = salary;
	
}


public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the designation
 */
public String getDesgination() {
	return designation;
}

/**
 * @param desgination the designation to set
 */
public void setDesignation(String designation) {
	this.designation = designation;
}

/**
 * @return the salary
 */
public double getSalary() {
	return salary;
}

/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}


	public int compareTo(employee employee) {//natural comparison method.
		if (this.salary > employee.salary  )
			return 1;
		if (this.salary == employee.salary ) // If salary is same , use name to sort
			return this.name.compareTo(employee.name);
		else return -1 ;
				
		}


public String toString(){
	return "Employee name:"+getName()+" , Designation:"+getDesgination()+" , Salary:"+getSalary();
}


}