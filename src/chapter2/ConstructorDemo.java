package chapter2;

public class ConstructorDemo {

	public static void main(String[] str) {
		
		Library lib = new Library();
		lib.libraryInfo();
		
		//Features of constructor
		//Feature #1: call constructor without creating an object
		new Library();
		
		//Feature #2: call normal function using constructor
		new Library().libraryInfo();
		
		//Feature #3: Dynamic function creation and calling
		new Library() {
			
			public void additionalInfo() {
				
				System.out.println("Librarian Name : ABC");
				System.out.println("Location: 2nd Floor");
			}
		
		}.additionalInfo();
	}
}


class Library {
	
	public Library() {
		
		System.out.println("Library name: Way of Darkness to Light");
	}
	
	public Library(String college_name) {
		
	}
	
	public void libraryInfo() {
		
		System.out.println("Total Blocks: 10");
		System.out.println("Total Books: 3000");
	}
	
	
	
	
}
