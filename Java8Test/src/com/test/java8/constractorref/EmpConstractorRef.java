package com.test.java8.constractorref;

public class EmpConstractorRef {

	public static void main(String[] args) {
		EmployeeFactory empFactory = Employee::new;
		Employee emp = empFactory.getEmployee("Shib", 40);
		emp.display();	

	}

}
