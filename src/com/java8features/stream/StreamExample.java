package com.java8features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8features.foreachandremoveif.Employee;

public class StreamExample {

	public static void main(String[] args) {

		//There are two ways to create stream 
		// 1. By using Static method -> "of" of stream class.
		Stream<String> jk = Stream.of("Akash","Arun","Arvind");	
		
		//2. By using "stream()" method of collection class
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(100, "Akshay", 300000.00));
		empList.add(new Employee(101,"Akash",80000.00));
		empList.add(new Employee(102,"kamlesh",70000.00));
		empList.add(new Employee(103,"Arjun",40000.00));
		empList.add(new Employee(104,"karan",50000.00));
		empList.add(new Employee(105,"Amol",10000.00));
		empList.add(new Employee(106,"Aniket",20000.00));
		Stream<Employee> stream = empList.stream();
		//stream methods 1.filter()
		//filter() In filter(predicate<>) filter uses predicate functional interface takes an arg and returns boolean
		empList.stream().filter(emp -> emp.getEmpName().startsWith("k")); //if empName starts with k it returns true.
		
		//forEach() In forEach(consumer<>) forEach uses consumer functional interface takes and arg and no return.
		empList.stream().filter(emp -> emp.getEmpName().startsWith("A")).forEach(e -> System.out.println(e.getEmpName()));
		
		//map() map method has function arg as a parameter it takes obj and also returns obj.
		empList.stream().map(emp -> emp.getEmpName()); // return obj is String->emp.getName()
		empList.stream().map(emp -> {emp.getEmpName(); return emp.getEmpId();}); // return obj is Integer->emp.getEmpId()
		
		//collect() it takes collectors as arg. we can create collect by using collect method. it returns list,set,etc
		List<Integer> collect = empList.stream().map(emp -> {emp.getEmpName(); return emp.getEmpId();}).collect(Collectors.toList());
		Set<Integer> collect2 = empList.stream().map(emp -> {emp.getEmpName(); return emp.getEmpId();}).collect(Collectors.toSet());
		
		//Q1. print name of all even id employees
		empList.stream().filter(emp -> emp.getEmpId()%2==0).forEach(e -> System.out.println(e.getEmpName()));
		
		//Q2. create set of all odd id employees
		Set<Employee> oddEmpSet = empList.stream().filter(emp -> emp.getEmpId()%2!=0).collect(Collectors.toSet());
		
		//Q3. All empId in seperate List/set
		Set<Integer> idEmpSet = empList.stream().map(emp -> emp.getEmpId()).collect(Collectors.toSet());
	}

}
