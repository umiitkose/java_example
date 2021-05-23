package com.umiitkose.exception;

public class ErrorExample {

	//Throwable nesnesinin parent 'i olduğu için bunu direk çağırabiliriz. ama bu JVM tarafından atılır. Biz tespit edemeyiz.
	public static void main(String[] args) {
//		throwError1();
//		throwError2();
		recursiveMethod();
	}

	public static void throwError1() {
		System.out.println("I'll throw an error now!");
		throw new OutOfMemoryError("Just kidding!");
	}

	public static void throwError2() {
		System.out.println("I'll throw an error now!");
		try {
			throw new OutOfMemoryError("Just kidding!");
		} catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}
	}

	public static void recursiveMethod() {
		recursiveMethod();
	}
}
