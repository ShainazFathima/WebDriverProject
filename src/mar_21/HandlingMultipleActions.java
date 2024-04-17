package mar_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultipleActions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://myntra.com/");
         Thread.sleep(5000);
         //create object for actions class
         Actions ac = new Actions(driver);
         //move the mouse to kids
         ac.moveToElement(driver.findElement(By.xpath("//a[@data-group='kids']")));
         ac.perform();
         //move the mouse to soft toys and click on it
         ac.moveToElement(driver.findElement(By.linkText("Soft Toys")));
         ac.pause(5000);
         ac.click().perform();
         //move the mouse to beauty
         ac.moveToElement(driver.findElement(By.xpath("//a[@data-group='beauty']")));
         ac.perform();
         Thread.sleep(5000);
         //move to hair oil link and click
         ac.moveToElement(driver.findElement(By.linkText("Hair Oil")));
         ac.pause(5000);
         ac.click().perform();
         Thread.sleep(5000);
         driver.quit();
         
	}

}
