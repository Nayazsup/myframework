package java_programs;

public class PrintBothMinimumLengthStringValues {

	public static void main(String[] args) {

		String str[]= {"hello","hi","abc","ab","welcome","tyss" ,"so"};
		String min=str[0];
		for (int i = 0; i < str.length; i++) {
			if(min.length()>str[i].length())
			{
				min=str[i];
			}
		}
		
		//this for loop is to compare min string value length with other values length
		for (int i = 0; i < str.length; i++) {
			if(min.length()==str[i].length())
			{
				System.out.print(str[i]+" ");
			}
			
		}

	}

}
