package mar_13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verify_url {

	@Test
	public void verifyurl() throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com");
		Thread.sleep(5000);
		String Expected ="https://";
		String Actual = driver.getCurrentUrl();
		if (Actual.startsWith(Expected))
		{
			Reporter.log("URL is secured"+Expected+" "+Actual);
		} 
		else
		{
			Reporter.log("URL is  not secured"+Expected+" "+Actual);
		}
	driver.quit();
	

}
}