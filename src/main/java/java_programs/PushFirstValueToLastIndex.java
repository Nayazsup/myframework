package java_programs;

public class PushFirstValueToLastIndex {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50};
		int temp=a[0];
		for (int i = 1; i < a.length; i++) {
			
			a[i-1]=a[i];
			
			
		}
		a[a.length-1]=temp;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
	}
	

}
