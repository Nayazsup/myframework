package java_programs;

public class FirstAndSecondMAximumWithoutBubbleS {
	
	public static void main(String[] args) {
		     //    0  1  2  3  4
		int a[]= {20,50,30,10,40};
		int fmax=a[0];//20
		int smax=a[0];//20
		                   //a.length=5
		for (int i = 0; i < a.length; i++) { //we can also take i=1 
			
			if(fmax<a[i])  //i=1  20<50 condition true enter block
			{
				smax=fmax;  //first initialise smax=20
				fmax=a[i];   //fmax=50
			}else if(smax<a[i]) {
				
				smax=a[i];
				
			}
				
			
		}
		System.out.println("The first and second maximum is "+fmax+" and "+smax);
		
		
		
	}

}
