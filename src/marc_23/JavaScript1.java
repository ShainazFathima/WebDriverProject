package marc_23;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#txtUsername').value='Admin'");
		js.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(5000);
		String Expected = "dashboard";
		String Actual = js.executeScript("return document.URL").toString();
		if(Actual.contains(Expected))
		{
			System.out.println("Login Success"+"  "+Expected+"    "+Actual);
		}
		else
		{
			String error_message = js.executeScript("return document.querySelector('#spanMessage').innerHTML").toString();
			System.out.println(error_message+" "+Expected+"===="+Actual);
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
