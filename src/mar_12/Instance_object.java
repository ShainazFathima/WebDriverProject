package mar_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Instance_object {

	 @Test
	 public void logintest() throws Throwable {
		 
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch URL 
		driver.get("http://primusbank.qedge.com/");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		//suspend tool for 5 secs
		Thread.sleep(5000);
		//close browser
		driver.quit();
		
		
			

	}

}
