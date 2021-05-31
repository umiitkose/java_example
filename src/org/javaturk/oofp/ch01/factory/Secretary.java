package org.javaturk.oofp.ch01.factory;

public class Secretary extends Employee {

	protected Manager managerServed;
	
	public Secretary(int no, String name, int year, String department, Manager managerServed) {
		super(no, name, year, department);
		this.managerServed=managerServed;
	}
	
	public void work(){
		System.out.println("Secretary is working!");
		serve();
	}
	
	public void serve(){
		System.out.println("Secretary " + name + " serves her manager: " + managerServed.toString());
	}

}
