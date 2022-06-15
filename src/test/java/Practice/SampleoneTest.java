package Practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class SampleoneTest {
    
	@Test
	public void narTest() throws MalformedURLException, InterruptedException{
		
 URL url = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("https://gmail.com");
		

	
	}
}
