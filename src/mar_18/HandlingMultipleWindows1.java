package mar_18;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleWindows1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		//get parent id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//click 3 links
		driver.findElement(By.xpath("(//a[contains(text(),'Terms')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Privacy Policy')])[2]")).click();
	    driver.findElement(By.linkText("Cookies Policy")).click();
	    //get collection of all window ids
	    Set<String> allwins = driver.getWindowHandles();
	    System.out.println(allwins);
	    for (String each : allwins) {
			//if parent id not equals to each
	    	if(!parent.equals(each))
	    	{
	    		//switch to each child window n get title n close
	    		String pagetitle = driver.switchTo().window(each).getTitle();
	    		System.out.println(pagetitle);
	    		Thread.sleep(5000);
	    		driver.close();
	    	}
	    }
	    //switch to parent
	    driver.switchTo().window(parent);
	    Select element = new Select(driver.findElement(By.id("year")));
	    List<WebElement> all_items = element.getOptions();
	    System.out.println("No of items are::;"+all_items.size());
	    for (WebElement each : all_items) {
			System.out.println(each.getText());
		}
	    driver.quit();
		

	}

}
