package java_programs;

public class IncrementallyPrintCharatersOfString {

	public static void main(String[] args) {
		
		String s="india";
		String some=""; 
		for (int i = 0; i < s.length(); i++) {
			some=some+s.charAt(i);
			System.out.println(some);
			
		}
	}

}
