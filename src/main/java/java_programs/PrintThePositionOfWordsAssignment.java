package java_programs;

import java.util.LinkedHashSet;

public class PrintThePositionOfWordsAssignment {

	public static void main(String[] args) {

		String s="khatam Ta ta Bye bye";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
			
		}
		
		for (String ch : set) {
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if(ch.equalsIgnoreCase(str[i]))
				{
				count++;
				}
				
			}
			System.out.println(ch+"="+count);
		}
	}

}
