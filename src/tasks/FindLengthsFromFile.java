package tasks;

import java.io.File;

public class FindLengthsFromFile {

	public static void main(String[] str) {
		
		File f = new File("A:\\Classes\\FullStackClasses\\");
		
		String[] st = f.list();
		
		for(String st1: st) {
			
			System.out.println(st1 + " => " + st1.length() + "characters");
		}
	}
}
