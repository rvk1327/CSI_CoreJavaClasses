package chapter1;

public class ConditionalStatements {

	public static void main(String[] str) {
		
		int x = 400, y = 300;
		
		if(x > y) { 
			
			System.out.println("X is greater than Y");
			
			class JavaClass {
				
				public void display() {
					
					System.out.println("Hello world");
				}
			}
			
			JavaClass jc = new JavaClass();
			jc.display();
		
		}else if (y > x){
			
			System.out.println("Y is greater than X");
		
		}else {
			
			System.out.println("Both values are equal");
		}
	}
}
