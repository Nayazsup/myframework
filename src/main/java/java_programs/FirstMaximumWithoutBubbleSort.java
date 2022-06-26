package java_programs;

public class FirstMaximumWithoutBubbleSort {

	public static void main(String[] args) {
		
		int a[]= {20,40,50,30,10};
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("The maximum number is "+max);
	}

}
