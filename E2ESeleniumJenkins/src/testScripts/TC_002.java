package testScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {
	
	@Test
	public void testcase1()
	{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElementById("email").sendKeys("hello");
	driver.findElementById("pass").sendKeys("hello");
	driver.quit();
	}

}
