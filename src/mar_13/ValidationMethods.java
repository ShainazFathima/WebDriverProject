package mar_13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidationMethods {

	@Test
	public void validationmethods() throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com");
		Thread.sleep(5000);
		//print title of page and length of title
		String pagetitle = driver.getTitle();
		Reporter.log(pagetitle);
		Reporter.log("page title length is::", pagetitle.length());
		//print url and its length
		String strURL = driver.getCurrentUrl();
		Reporter.log(strURL);
		Reporter.log("Domain length is::", strURL.length());
		driver.quit();

	}

}
