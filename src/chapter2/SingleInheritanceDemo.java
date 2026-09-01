package chapter2;

public class SingleInheritanceDemo {

	public static void main(String[] str) {
		
		SingleB sb = new SingleB();
		System.out.println(sb.class_name);
		sb.collegeInfo();
		SingleB.studentInfo();
		
		sb.bookInfo();
	}
}

class SingleA {
	
	String class_name = "SINGLE-A";
	
	public SingleA() {
		
		System.out.println("Class Name : " + class_name);
	}
	
	public void collegeInfo() {
		
		System.out.println("College Name: CSI College of engineering and technology");
		System.out.println("Location : Ketti");
	}
	
	public static void studentInfo() {
		
		System.out.println("Roll No : St-1");
		System.out.println("Name: ABC");
	}
}

class SingleB extends SingleA {

	public SingleB() {
		
		System.out.println("Class Name: SINGLE-B");
	}
	
	public void bookInfo() {
		
		System.out.println("Book Name: The Complete Reference of Java");
		System.out.println("Author: Herbert Schildt");
		collegeInfo();
	}
}





