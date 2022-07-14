package java_programs;

public class Sample1 {

	public static void main(String[] args) {

		String s="welcometoindiaindia";
	String[] so = s.split("");
	
	for (int i = 0; i < so.length; i++) {
		int count=0;
		System.out.print(so[i]+"=");
		for (int j = 0; j < so.length; j++) {
			if(so[i].equals(so[j]))
			{
				count++;
			}
			
		}
		System.out.print(count+" ");
		
	}
	}

}
