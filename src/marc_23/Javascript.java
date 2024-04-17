package marc_23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws Throwable {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demo.opencart.com/");
       JavascriptExecutor js = (JavascriptExecutor)driver;
       Thread.sleep(5000);
       driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
       driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
       js.executeScript("document.querySelector(\"#input-firstname\").value='Akhilesh'");
       js.executeScript("document.getElementById('input-lastname').value='Kumar'");
       js.executeScript("document.querySelector('#input-email').value='abc@gmail.com'");
       js.executeScript("document.querySelector(\"#input-password\").value='acb123!'");
       js.executeScript("window.scrollBy(0,400)");
       Thread.sleep(5000);
       js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
       Thread.sleep(3000);
       js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
       Thread.sleep(3000);
       js.executeScript("document.querySelector(\"button[type='submit']\").click()");
       driver.quit();
	}

}
