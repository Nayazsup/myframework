package java_programs;

public class SumOfTwoArrays {

	public static void main(String[] args) {

		int a[]= {1,2,3};
		int b[]= {4,5,6,7};
		int z[]= {};		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				 z[j]=a[i]+b[j];
				
			}
			
		}
		for (int i = 0; i < z.length; i++) {
			System.out.println(z[i]);
		}
		
	}

}
