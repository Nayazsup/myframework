package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actilogin_prop {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=null;
		FileInputStream fis=new FileInputStream("./data/comman.properties");
		Properties pro=new Properties();
		pro.load(fis);

		String browser = pro.getProperty("browser1");
		String url = pro.getProperty("url1");
		String username = pro.getProperty("un");
		String password = pro.getProperty("pwd");

		if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.close();


	}

}
