package mar_13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vrify_Title {

	@Test
	public void verifytitle() throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String Expected = "google";
		String Actual = driver.getTitle();
		 if (Expected.equalsIgnoreCase(Actual)) {
			 Reporter.log("Title is matching:::"+ Expected+" "+Actual);
		} 
		 else 
		 {Reporter.log("Title is not matching:::"+Expected+" "+Actual);

		} 
		 driver.quit();
		 {
			
		}
		
			
		
	}

}
