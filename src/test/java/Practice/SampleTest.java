package Practice;

import org.testng.annotations.Test;



public class SampleTest {

	
	
	@Test
	public void createcontactTest() {
		
			 System.out.println("contact created");
			 
		 }
	@Test
	
	(dependsOnMethods ="createcontactTest", invocationCount = 1)
		 public void modifycontactTest()
		 {
			 System.out.println("contact modified");
		 }
	@Test(dependsOnMethods = "createcontactTest")
		 public void deledcontactTest()
		 {
			 System.out.println("contact deleted");
	

	
}
}