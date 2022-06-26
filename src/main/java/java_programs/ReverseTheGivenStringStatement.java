package java_programs;

public class ReverseTheGivenStringStatement {

	public static void main(String[] args) {

		String s="Sa Re Ga Ma Na Sa";
		String[] str = s.split(" ");// it will split the given String from space " "
		for (int i =str.length-1; i >=0; i--) //this will fetch the words in reverse order
		{
		System.out.print(str[i]+" ");	
		}
	}

}
