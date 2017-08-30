
package employeeframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class arraylist {

	public static void main(String[] args) {
		// Generic TreeSet with object of Employee class.
		TreeSet<employee> treeSet = new TreeSet<employee>();
		// creating objects of Employee class
		employee employee1 = new employee("john", "TSA", 45000.00);
		employee employee2 = new employee("peter", "SE", 25000.00);
		employee employee3 = new employee("henry", "SA", 42000.00);
		

		// Adding objects to treeSet
		treeSet.add(employee1);
		treeSet.add(employee2);
		treeSet.add(employee3);
		

		System.out.println("Ascending Order of salaries and then name:");
		// Traversing TreeSet
		Iterator iterator1 = treeSet.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println("--");
		// Making treeSet to use the customized comparator , to do this we must
		// convert out set to list, so converting it to array list and passing
		// it with new comparator in sort method of Collection class
		ArrayList<employee> arrayList = new ArrayList<employee>(treeSet);
		Collections.sort(arrayList, new employeecomporator());// Using	customized comparator
														
		System.out.println("Ascending Order of Name and then designation:");
		Iterator iterator2 = arrayList.iterator();
		// Traversing TreeSet
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}