package java_programs;

public class ReverseStringUsing3rdVariable {

	public static void main(String[] args) {

		String z="india";
		String reverse="";
		for (int i = z.length()-1; i>=0; i--) 
		{
			reverse=reverse+z.charAt(i);
		}
		System.out.println(reverse);
	}

}
