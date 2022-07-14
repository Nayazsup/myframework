package Practice;

public class SortAscending {

	public static void main(String[] args) {

int ar[]= {10,40,50,30,20};
for (int i = 0; i < ar.length; i++) {
	
	for (int j = 0; j < ar.length; j++) {
		if(ar[i]<ar[j])
		{
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		
	}
	
}
for (int i = 0; i < ar.length; i++) {
	System.out.print(ar[i]+" ");
}
	}

}
