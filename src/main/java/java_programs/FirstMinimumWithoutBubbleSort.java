package java_programs;

public class FirstMinimumWithoutBubbleSort {
public static void main(String[] args) {
		
		int a[]= {20,40,50,30,10};
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("The Minimum number is "+min);
	}

}
