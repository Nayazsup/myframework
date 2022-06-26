package java_programs;

public class PrintBothMaximumLengthValues {
	
	public static void main(String[] args) {

		String str[]= {"dangers","hello","hi","abc","welcome","tyss" };
		String min=str[0];
		//this loop is to get maximum length value 
		for (int i = 0; i < str.length; i++) {
			if(min.length()<str[i].length())
			{
				min=str[i];
			}
		}
		
		//this for loop is to compare maximum string value length with other values length and to print it
		for (int i = 0; i < str.length; i++) {
			if(min.length()==str[i].length())
			{
				System.out.print(str[i]+" ");
			}
			
		}

	}


}
