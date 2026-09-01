package chapter2;

public class PolymorphismDemo {

	public static void main(String[] str) {
		
		Book b = new Book();
		b.info(1, 52630);
		b.info("Lab-1", "Dennis Ritchie Lab");
		b.display();
	}
}


class Lab {
	
	public void info(String lab_id, String lab_name) {
		
		System.out.println("Lab ID : " + lab_id);
		System.out.println("Lab Name : " + lab_name);
	}
	
	public void display() {
		
		System.out.println("Class Name : LAB");
	}
}

class Book extends Lab {
	
	public void info(int book_id, int ISBN) {
		
		System.out.println("Book ID : " + book_id);
		System.out.println("ISBN : " + ISBN);
	}
	
	public void display() {
		
		System.out.println("Class Name : BOOK");
	}
}






