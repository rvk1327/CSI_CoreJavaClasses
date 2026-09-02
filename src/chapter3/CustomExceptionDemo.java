package chapter3;

public class CustomExceptionDemo {

	public static void main(String[] str) throws SalaryException {
		
		String category = "x";
		double salary = 60000.00;
		
		String stname = "ABC";
		String lower = stname.toLowerCase();
		System.out.println(lower);
		System.out.println(stname);
		
		StringBuffer sb = new StringBuffer("hello");
		StringBuffer sb1 = sb.append(" java");
		System.out.println(sb1);
		System.out.println(sb);
		
		
		
		if((category.equals("x")) && (salary <= 50000.00)) {
			
			System.out.println("Successfully credited...");
		
		}else {
			
			throw new SalaryException();
		}
		
		System.out.println("ESI, HRA, PF Generated ...");
	}
}


class SalaryException extends Exception {
	
	public SalaryException() {
		
		System.out.println("Check category and salary");		
		
	}
	
	
}






