package com.java8features.lambdaexpression;

public class LamdaExpressionWithoutFunctionalInteface implements Employee {

	@Override
	public void getSalary() {
		System.out.println("Abstact method Employee Salary: 80000");

	}
	
	public void getEmployeeDetails() {
		Employee.super.details();
	}
	
	public void getCompanyName() {
		Employee.employeeCompany();
	}

	public static void main(String[] args) {
		
		LamdaExpressionWithoutFunctionalInteface le = new LamdaExpressionWithoutFunctionalInteface();
		Employee e = () -> System.out.println("lamda Expression without functional inteface : get Salary"); //for lamda expression interface should have only one abstact method
		e.getSalary();
		le.getSalary();
		le.getEmployeeDetails(); //Employee.super.details();
		le.getCompanyName(); //Employee.employeeCompany();
		FunctionalInterfaceEmployee fI = () -> System.out.println("lamda expression with functional Interface");
		fI.show();
		fI.doSomething();
		FunctionalInterfaceEmployee.range();
	}

}
