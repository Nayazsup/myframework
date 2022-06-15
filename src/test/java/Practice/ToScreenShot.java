package Practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.GenericUtilities.Baseclass;

@Listeners(com.crm.comcast.GenericUtilities.ListImpClass.class)
public class ToScreenShot extends Baseclass{

@Test
	public void test() {
		System.out.println("-----starts------");
		Assert.assertEquals("A", "B");
		System.out.println("-----ends------");

	}

}
