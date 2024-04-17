package marc_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingItems {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//store username textbox into webelement to access more than one web element method
		WebElement Objuser = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//clear text
		Objuser.clear();
		//send values into textbox
		Objuser.sendKeys("Admin");
		//capture username value
		String usernametext = Objuser.getAttribute("value");
		//store password textbox into webelement to access more than one web element method
		WebElement Objpass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		//clear text
		Objpass.clear();
		//send values into textbox
		Objpass.sendKeys("Qedge123!@#");
		//capture password value
		String passwordtext = Objpass.getAttribute("value");
		System.out.println(usernametext+" "+passwordtext );
		//click login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if (Actual.contains(Expected))
		{
			System.out.println("Username and password are valid::"+Expected+" "+Actual);
		} else
		{
         //capture error message
			String error_message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(error_message+Expected+" "+Actual);
			}
		Thread.sleep(5000);
		driver.quit();
		

	}

}
