package tasks;

public class StudentMarks {

	public static void main(String[] str) {
		
		int[] marks = {80,75,0,84,0,96,85,74,0,68,70};
		
		int[] rev_marks = new int[marks.length];
		
		int pos = 0;
		
		for(int i=0; i<marks.length; i++) {
			
			if(marks[i] != 0) {
				
				rev_marks[pos] = marks[i];
				
				pos++;
			}
		}
		
		  
		
		for(int i=0; i<rev_marks.length; i++) {
			
			System.out.println(rev_marks[i]);
		}
		
		
	}
}
