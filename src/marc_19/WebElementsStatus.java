package marc_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsStatus {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//verify firstname textbox is enabled or disabled
		WebElement firstname =driver.findElement(By.name("firstname"));
		boolean is_enable = firstname.isEnabled();
		System.out.println(is_enable);
		//verify reenter email textbox is displayed or hidden
		WebElement email = driver.findElement(By.name("reg_email_confirmation__"));
		boolean is_displayed = email.isDisplayed();
		System.out.println(is_displayed);
		//verifyfemale radio button is selected or not
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='1']"));
		boolean is_selected = radiobutton.isSelected();
		System.out.println(is_selected);
		driver.quit();

	}

}
