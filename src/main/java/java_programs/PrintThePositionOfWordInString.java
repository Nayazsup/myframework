package java_programs;

import java.util.LinkedHashSet;

public class PrintThePositionOfWordInString {

	public static void main(String[] args) {
		String s="welcome to india";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
			
		}
		
		for (String ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if(ch.equals(str[i]))
				{
					System.out.println(ch+"="+i);
					break;
				}
				
			}
			
		}
	}

}
