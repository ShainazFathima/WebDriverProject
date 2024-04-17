package mar8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

	public static void main(String[] args) throws Throwable {
		// To create instance object
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch URL 
		driver.get("https://google.com");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.quit();
	

	}

}
