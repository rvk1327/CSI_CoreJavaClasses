package chapter3;

public class StringDemo {

	public static void main(String[] str) {
		
		String st = "welcome";
		
		String st1 = new String("hello");
		
		char c = st.charAt(5);
		System.out.println(c);
		
		int x = st.codePointAt(5);
		System.out.println(x);
		
		String ccate = st.concat(" java");
		System.out.println(ccate);
		
		boolean res1 = st.contains("wlc");
		System.out.println(res1);
		
		boolean res2 = st.endsWith("ome");
		System.out.println(res2);
		
		boolean res3 = st.startsWith("wel");
		System.out.println(res3);
		
		boolean res4 = st.equals("Welcome");
		System.out.println(res4);
		
		boolean res5 = st.equalsIgnoreCase("wElCoMe");
		System.out.println(res5);
		
		byte[] by = st.getBytes();
		for(int i=0; i<by.length; i++) {
			System.out.println(by[i]);
		}
		
		int index_value = st.indexOf("e");
		System.out.println(index_value);
		
		int value = st.lastIndexOf("e");
		System.out.println(value);
		
		int length = st.length();
		System.out.println(length);
		
		String repeat = st.repeat(3);
		System.out.println(repeat);
		
		String repl = st.replace("elc", "abc");
		System.out.println(repl);
		
		String s = "welcome to java";
		String[] s1 = s.split("a");
		for(int i=0; i<s1.length; i++) {
			System.out.println(s1[i]);
		}
		
		String substr = st.substring(2, 6);
		System.out.println(substr);
		
		char[] ch = st.toCharArray();
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		String upper = st.toUpperCase();
		System.out.println(upper);
	}
}












