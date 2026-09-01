package chapter2;

public class MessagePassingDemo {

	public static void main(String[] str) {
	
		Student st1 = new Student();
		st1.rollno = "ST-2";
		st1.stname = "DEF";
		st1.emailid = "def@gmail.com";
		
		ObjectArgument obj1 = new ObjectArgument();
		obj1.studentObject(st1);
		
		ObjectReturn obj2 = new ObjectReturn();
		Student st2 = obj2.getStudent(); //st
		st2.display();
	}
}


class ObjectArgument {
	
	public void studentObject(Student st) {
		
		st.display();
	}
}

class ObjectReturn {
	
	public Student getStudent() {
		
		String str = "welcome";
		Student st = new Student();
		return st;
	}
}






