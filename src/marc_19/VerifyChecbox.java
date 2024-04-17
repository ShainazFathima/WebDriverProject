package marc_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyChecbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//verify checkbox is selected or not
		WebElement checkbox = driver.findElement(By.name("remember"));
            boolean value = checkbox.isSelected();
            System.out.println(value);
            if(value)
            {
            //if value is true uncheck the check box
            	checkbox.click();
            }
            else
            {
            	//if value is fasle check the check box
            	checkbox.click();
            }
            Thread.sleep(5000);
            driver.quit();
            
	}

}
