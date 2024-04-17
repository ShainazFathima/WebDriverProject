package mar_26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender1 {

	public static void main(String[] args) throws Throwable {
		String dob = "20/December/1987";
		String temp[]=dob.split("/");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(5000);
		String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calyear.equals(year))
		{
			//click on previous button
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			}
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equals(month)) {
			//click on previous button
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		//iterate rows
		for (WebElement eachrow : rows) {
			//get collection of cols frm each row
			cols = eachrow.findElements(By.tagName("td"));
			//iterate cols
			for (WebElement eachcol : cols) {
				if(eachcol.getText().equals(date)) 
				{
					Thread.sleep(5000);
					//click date
					eachcol.click();
				}
			}
		}
		
		
		

	}

}
