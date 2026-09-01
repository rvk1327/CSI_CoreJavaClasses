package chapter2;


//Java Bean
//Getter and Setter
//POJO (Plain Old Java Object)
public class Employee {

	private String emp_name;
	private double salary;
	
	public void addEmpName(String emp_name1) {
		
		emp_name = emp_name1;
	}
	
	public void addSalary(double salary1) {
		
		salary = salary1;
	}
	
	public String getName() {
		
		return emp_name;
	}
	
	public double getSalary() {
		
		return salary;
	}
}
