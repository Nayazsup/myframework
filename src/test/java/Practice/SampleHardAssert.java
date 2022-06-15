package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleHardAssert {
	
	@Test
	public void testcase1()
	{
		System.out.println("test1");
		System.out.println("test2");
		Assert.assertEquals("A", "B");
		System.out.println("test3");
		System.out.println("test4");
		
		
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("test5");
		System.out.println("test6");
		System.out.println("test7");
		System.out.println("test8");
		
	}

}
