package com.umiitkose.exception;

public class RaisingExample {

	public static void main(String[] args) throws Throwable  {
		doSomething();
		//Herkes yukarıya throw 'u raise ettiği için aşağıdaki kısım yazılmayacak. Çünkü JVM çalışmayı durduruyor.
		System.out.println("After doSomething()!");
	}
	
	private static void doSomething() throws Throwable {
		doSomethingElse();		
	}
	
	private static void doSomethingElse() throws Throwable {
		throwAThrowable();		
	}

	public static void throwAThrowable() throws Throwable {
		Throwable throwable = new Throwable("Just kidding!");
		throw throwable; //Eğer objeyi oluşturup throw etmezsem main 'deki print yazılacaktı. bunu yorum satırına alabilirsin.
	}
}
