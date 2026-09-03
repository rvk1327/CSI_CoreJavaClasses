package chapter3;

import java.util.ArrayList;
import java.util.List;

public class AnnotationDemo {

	public static void main(String[] str) {
		
		@SuppressWarnings("cheked")
		List lst = new ArrayList();
		
		Annoat2 an2  = new Annoat2();
		an2.calc();
		
		an2.display1();
		an2.display2();
	}
}


@FunctionalInterface
interface EmployeeRepository {
	
	public void employeeDetails();
	//public void employeeDetails1();
}


class Annoat1 {
	
	public void calc() {
		System.out.println(10+20);
	}
}


class Annoat2 extends Annoat1 {
	
	@Override
	public void calc() {		
		System.out.println(10*20);
	}
	
	@Deprecated
	public void display1() {
		
		System.out.println("Employee ID: EMP-1");
	}
	
	public void display2() {
		
		System.out.println("Employee ID: EMP-1");
		System.out.println("Employee Name : ABC");
		System.out.println("Employee Salary: 50000.00");
	}
}










