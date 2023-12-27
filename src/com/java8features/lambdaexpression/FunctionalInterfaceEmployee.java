package com.java8features.lambdaexpression;

@FunctionalInterface
public interface FunctionalInterfaceEmployee {

	public void show();
	public default void doSomething() {
		System.out.println("Functional Interface: default method");
	}
	public static void range() {
		System.out.println("Functional Interface: static method");
	}
	//we can have multiple default and static method but only one abstact method
}
