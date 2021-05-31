package org.javaturk.oofp.ch01.factory;

public class PayrollOffice {

    public void paySalary(Employee employee) {

        double salary = employee.calculateSalary();
        if (employee instanceof Manager) {
            Manager m = (Manager) employee;
			System.out.println("Paying a salary of " + salary + " to " + employee.getName() + m.departmentManaged);
        }else
        System.out.println("Paying a salary of " + salary + " to " + employee.getName());
    }
}
