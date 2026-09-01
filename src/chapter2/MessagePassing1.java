package chapter2;

public class MessagePassing1 {

	public static void main(String[] str) {
		
		String name = "abc";
		double emp_salary = 50000.00;
		
		Employee emp = new Employee();
		emp.addEmpName(name);
		emp.addSalary(emp_salary);
		
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
}
