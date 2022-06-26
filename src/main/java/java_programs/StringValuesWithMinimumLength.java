package java_programs;

public class StringValuesWithMinimumLength {
	
public static void main(String[] args) {
		
		String str[]= {"hello","hi","abc","welcome","tyss" };
		String min=str[0];
		
		for (int i = 0; i < str.length; i++) {
			
			if(min.length()>str[i].length())
			{
				min=str[i];
			}
			
		}
		System.out.println("The String value with maximum length is "+min);
		


	}

}
