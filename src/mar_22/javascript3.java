package mar_22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://myntra.com'");
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		Thread.sleep(5000);
		//scroll to men link n click it
		WebElement element = driver.findElement(By.linkText("Men"));
		//scroll to men link n click it
		js.executeScript("document.scrollInToView", element);
		element.click();
		String pagetitle1 = js.executeScript("return document.title").toString();
		System.out.println(pagetitle1);
	}

}
