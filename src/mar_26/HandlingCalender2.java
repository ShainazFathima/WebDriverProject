package mar_26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCalender2 {

	public static void main(String[] args) throws Throwable {
		String dol = "2024-October-19";
		String temp[]=dol.split("-");
		String year = temp[0];
		String month = temp[1];
		String date = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).click();
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		Thread.sleep(5000);
		//select year from calender
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
		Thread.sleep(5000);
		//select month from calender
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByIndex(9);
		Thread.sleep(5000);
		//select date 
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		//get collection of rows
		rows = webtable.findElements(By.tagName("tr"));
		//iterate rows
		for (WebElement eachrow : rows) {
			//get collection of cols frm each row
			cols = eachrow.findElements(By.tagName("td"));
			//iterate cols
			for (WebElement eachcol : cols) {
				if(eachcol.getText().equals(date)) {
					//click date
					eachcol.click();
				}
			}
			
		}
	}

}
