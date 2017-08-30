package employeeframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class duplicate {

	public static void main(String[] args) {
ArrayList<String> list = new ArrayList<String>(); //Array list to store name as String variable, Array list stores duplicate values
list.add("John"); // adding elements to list
list.add("Peter");
list.add("Henry");
list.add("john");
list.add("Peter");
list.add("Peter");
list.add("byron");

//traversing list
Iterator iterator1 =list.iterator();
System.out.println("Collection with duplicates");
while(iterator1.hasNext()) {
	System.out.println(iterator1.next());
	
}
/*
 *To Eliminate duplicate values , storing the values from arraylist to linked hash set, which stores only unique values and passing the hashset values to array list listWithOutDuplicate  
 */
ArrayList<String> listWithOutDuplicate = new ArrayList<String>(new LinkedHashSet<String>(list)); 
Iterator iterator2 =listWithOutDuplicate.iterator();// iterator to iterate the elements present in listWithOutDuplicate
System.out.println("\nCollection without duplicates");
while(iterator2.hasNext()) {
	System.out.println(iterator2.next());
	
}


	}

}