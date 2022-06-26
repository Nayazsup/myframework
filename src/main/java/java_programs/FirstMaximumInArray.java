package java_programs;

public class FirstMaximumInArray {
	
	public static void main(String[] args) {
		
		
		int a[]= {30,10,50,40,20};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;}
			}
		}
		
			System.out.print(a[0]);//for first maximum
			//System.out.print(a[1]); for second maximum
			//System.out.print(a[3]); for third maximum

		
		}

}
