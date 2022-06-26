package java_programs;

public class SeparateCharactersNumbersAndScharatersFromString {

	public static void main(String[] args) {

		String sp="abc123#$@";
		String alphabets="";
		String numbers="";
		String Specialchar="";
		for (int i = 0; i < sp.length(); i++)
		{
			char ch=sp.charAt(i);
			if(ch>='a' && ch<='z' ||  ch>='A' && ch<='Z' )
			{
				alphabets=alphabets+ch;
			}else if(ch>='0' && ch<='9'  )
			{
				numbers=numbers+ch;
			}else 
			{
				Specialchar=Specialchar+ch;
			}
			
		}
		System.out.println(alphabets);
		System.out.println(numbers);
		System.out.println(Specialchar);
	}

}
