package mar_26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCalender3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		String dol= "2024-April-9";
		String temp[]=dol.split("-");
		String year=temp[0];
		String month = temp[1];
		String date = temp[2];
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).click();
		driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[2]/img")).click();
		Thread.sleep(5000);
		//select  year frm calender
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
		Thread.sleep(5000);
		//select month frm cal
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByIndex(3);
		Thread.sleep(5000);
		//select date frm cal
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		//get collection of rows
		List<WebElement>rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		//iterate rows
		for (WebElement eachrow : rows) {
			//get cols collection
			cols = eachrow.findElements(By.tagName("td"));
			//iterate cols
			for (WebElement eachcol : cols) {
				//get text frm each col
				if(eachcol.getText().equals(date)) {
					//click date
					eachcol.click();
					}
				
			}
		}
		
		
		
		
	}

}
