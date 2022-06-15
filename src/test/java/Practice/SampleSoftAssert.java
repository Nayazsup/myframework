package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleSoftAssert {
	
	@Test
	public void organization()
	{
		System.out.println("test1");
		System.out.println("test2");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("A", "B"); //Soft assert will not work without assertAll()
		                            //
		
		System.out.println("test3");
		
		System.out.println("test4");
		sa.assertAll("mugitu");
		
	}

}
