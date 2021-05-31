package com.umitkose.exception;

public class CatchingExample {

	public static void main(String[] args) {
		// doSomething(); --> Bunu açarsak ya yukarıya Throwable edicez ama bunu yaparsak aşağısındaki hiçbir işlem çalışmaz !!
		//doSometing(); 'de dikkat edersen hata olduğu an catch 'e girer ve aşağıdaki işlemler çalışmaz.

		try {
			doSomething();
			System.out.println("After doSomething()1!");
		} catch (Throwable e) {
			System.out.println("Catching a Throwable: " + e.getMessage());
		}
		System.out.println("After doSomething()2!");
	}

	private static void doSomething() throws Throwable { // No need for throws
		/*try { --> main 'de değilde hatayı aldığı bir alt metotta çağırılırsa aşağıdaki gibi yapılır, throws Throwable ile çağırıldığı yere de bunu bildirmeye gerek olmaz.
			doSomethingElse();
			System.out.println("After doSomething()1!");
		} catch (Throwable e) {
			System.out.println("Catching a Throwable: " + e.getMessage());
		}*/
		doSomethingElse();
	}

	private static void doSomethingElse() throws Throwable {
		throwAThrowable();
	}

	public static void throwAThrowable() throws Throwable {
		double random = Math.random();
		if (random < 0.5) {
			System.out.println("I have a problem while I am doing my work :(. Random: " + random);
			Throwable throwable = new Throwable("Just kidding!");
			throw throwable; //throws Throwable  --> throw throwable olduğu için var.
		} else
			System.out.println("I am doing my work without any problem at all:)");
	}
}
