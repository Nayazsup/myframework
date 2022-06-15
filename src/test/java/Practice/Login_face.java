package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_face {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("nayazahmed1998@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nayaz1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}


}
