package java_programs;

public class PrintOnlyVowelsFromString {

	public static void main(String[] args) {

		String z="india";
		for (int i = 0; i < z.length(); i++)
		{
			char ch=z.charAt(i);
			if(ch=='a' | ch=='e' | ch=='i' | ch=='o' | ch=='u')
			{
				System.out.println(ch);
			}
			
			
		}
		
	}

}
