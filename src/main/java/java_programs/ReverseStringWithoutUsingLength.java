package java_programs;

public class ReverseStringWithoutUsingLength {

	public static void main(String[] args) {

		String z="india";
		String reverse="";
		char[] ch = z.toCharArray();
		for (char c : ch) {
			reverse=c+reverse;	
		}
		System.out.println(reverse);
	}

}
