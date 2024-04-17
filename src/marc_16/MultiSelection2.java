package marc_16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/MultiListboxHtmlpage_lyst8730.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//select 0to9 items
		for(int i=0;i<=9;i++)
		{
			Thread.sleep(3000);
			dropdown.selectByIndex(i);
		}
		//get collection of items which are selected
		List<WebElement> all_selected = dropdown.getAllSelectedOptions(); 
		System.out.println("No of item selected are::"+all_selected.size());
		//print each item name which are selected
		for (WebElement each : all_selected) {
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.quit();
				

	}

}
