package java_programs;

public class FirstMinimunInArray {
	public static void main(String[] args) {
		
	
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
	
		System.out.print(a[0]); //first minimum
	//System.out.print(a[1]); Second minimum
	}
}

