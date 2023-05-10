package javaupskilling;

public class ReverseString {
	
	public static void main(String[]args) {
		String s = "HARI";
	
		for (int i=s.length();i>0;--i) {
			
			System.out.println(s.charAt(i-1));
		}
	}

}
