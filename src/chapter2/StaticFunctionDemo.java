package chapter2;

public class StaticFunctionDemo {

	public static void main(String[] str) {
		
		StaticFunction sf = new StaticFunction();
		sf.studentInfo();
		sf.studentMark();
		
		StaticFunction.studentMark();
	}
}

class StaticFunction {
	
	//normal function
	public void studentInfo() {
		
		System.out.println("Roll No :  ST-1");
		System.out.println("Name : ABC");
	}
	
	//static function
	public static void studentMark() {
		
		System.out.println("Web Technology: 85.96");
		System.out.println("Grade: A");
	}
	
}
