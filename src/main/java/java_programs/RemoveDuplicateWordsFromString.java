package java_programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsFromString {

	public static void main(String[] args) {

		String s="welcome to india india";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for (int i = 0; i < str.length; i++)
		{
			set.add(str[i]);
		}
		
		for (String st : set) {
			
			System.out.print(st+" ");
			
		}
	}

}
