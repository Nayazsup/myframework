package java_programs;

public class SumOfFirst3Minimum {
	public static void main(String[] args) {
		int sum=0;
		int a[]= {30,10,50,40,20};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;}
			}
		}
		for(int i=0;i<3; i++)
		{
			sum=sum+a[i];
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
			System.out.println("The sum of first 3 maximum number is "+sum);
	}

}
