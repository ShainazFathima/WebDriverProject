package marc_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//click on sigin button without login details
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		//capture alert message
		String alert_message = driver.switchTo().alert().getText();
		System.out.println(alert_message);
		//click ok to alert msg
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
