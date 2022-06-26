package java_programs;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueCharactersFromString {

	public static void main(String[] args) {
		
		String s="india";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		/* linkedhasset will follow order of insertion and   */
		
		for (int i = 0; i < s.length(); i++) //this loop is to add fetch characters from a string and add it to the set
		{
			set.add(s.charAt(i));
		}
		
		for (Character ch: set) {
			int count=0;
			for (int i = 0; i <s.length(); i++) // this loop is to fetch characters from a given String 
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count==1) {
			System.out.print(ch);
			}
		}

	}

}
