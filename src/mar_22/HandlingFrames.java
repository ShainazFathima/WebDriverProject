package mar_22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac = new Actions(driver);
		//get collection of frames in webpage
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));
			System.out.println(frames.size());
	//switch to frame 
			driver.switchTo().frame(0);
			//perform drag n drop actions
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			ac.clickAndHold(source).moveToElement(target).release().perform();
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
			Thread.sleep(5000);
			driver.quit();
			
			
	}

}
