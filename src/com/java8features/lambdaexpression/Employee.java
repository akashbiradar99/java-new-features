package com.java8features.lambdaexpression;

public interface Employee {

	public void getSalary();
	
	default void details() {
		System.out.println("Default method: Employee Details");
	}
	
	static void employeeCompany() {
		System.out.println("Static method: HubEngage India Pvt. Ltd");
	}
	
}
