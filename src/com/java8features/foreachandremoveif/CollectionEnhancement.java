package com.java8features.foreachandremoveif;

import java.util.ArrayList;
import java.util.List;

public class CollectionEnhancement {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(100,"Akash",80000.00));
		empList.add(new Employee(100,"kamlesh",70000.00));
		empList.add(new Employee(100,"Arjun",40000.00));
		empList.add(new Employee(100,"karan",50000.00));
		empList.add(new Employee(100,"Amol",10000.00));
		empList.add(new Employee(100,"Aniket",20000.00));
		
		//forEach use consumer-> which takes one arg and consumes(do operation. no return type)
		empList.forEach(emp -> {
			System.out.println("In forEach:"+emp.getEmpName());
		});
		
		//removeIf use predicate -> which take arg and return boolean.
		//Removes all of the elements of this collection that satisfy the given predicate. 
		empList.removeIf(emp -> emp.getEmpName().startsWith("k"));
		
		empList.forEach(e ->System.out.println("After removeIf EmpName: "+e.getEmpName()));
		
		
		
	}

}
