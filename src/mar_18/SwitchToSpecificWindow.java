package mar_18;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToSpecificWindow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//click 3 links
		driver.findElement(By.xpath("(//a[contains(text(),'Terms')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Privacy Policy')])[2]")).click();
		driver.findElement(By.linkText("Cookies Policy")).click();
		//store allwindows into array list
	ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
	Thread.sleep(5000);
	driver.switchTo().window(brw.get(2));
	System.out.println(driver.getTitle());
	driver.findElement(By.name("email")).sendKeys("pranga2000@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("#$%#$%12345689");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Thread.sleep(5000);
	driver.close();

	}

}
