package marc_19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionOf_CheckBoxes {

	public static void main(String[] args) throws Throwable {
		//get collection of checkboxes
		//verify which checkbox is true or false
		//get each checkbox name stored into property value
		//uncheck the checkbox name stored into value property and check the checkbox if not checked
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/checkbox_1_lyst7599.html");
		Thread.sleep(5000);
		List<WebElement> all_checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("No. of checkboxes are::"+all_checkboxes.size());
		for (WebElement each : all_checkboxes) {
			boolean value = each.isSelected();
			String checkboxname = each.getAttribute("value");
			System.out.println(checkboxname+"====="+value);
            each.click();
		}
		Thread.sleep(5000);
		driver.quit();
				
	}

}
