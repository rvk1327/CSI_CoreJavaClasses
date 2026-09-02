package tasks;

public class ChangeUpperCase {

	public static void main(String[] str) {
		
		String st = "welcome";
		
		String upper = st.toUpperCase();
		char first = upper.charAt(0);
		char last = upper.charAt(upper.length()-1);
		
		String balance = st.substring(1, st.length()-1);
		
		String result = first + balance + last;
		System.out.println(result);
		
		
		//String res = upper.charAt(0) + st.substring(1, st.length()-1) + upper.charAt(upper.length()-1);
		
		
		
		
	}
}
