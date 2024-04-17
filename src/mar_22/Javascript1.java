package mar_22;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//create  obj for java interface
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//launch url 
		js.executeScript("window.location='https://www.tatacliq.com/'");
		Thread.sleep(5000);
		//print title and length of title
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
         System.out.println(pagetitle.length());
         //print url and get length of url
         String strurl = js.executeScript("return document.URL").toString();
         System.out.println(strurl);
         System.out.println(strurl.length());
         //print domain and length of domain
         String domain = js.executeScript("return document.domain").toString();
         System.out.println(domain);
         System.out.println(domain.length());
         Thread.sleep(5000);
         driver.quit();
	}
         
         
}
