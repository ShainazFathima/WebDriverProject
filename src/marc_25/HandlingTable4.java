package marc_25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable4 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
         Thread.sleep(5000);
         //store table into webelement
         WebElement webtable = driver.findElement(By.className("ws-table-all"));
         List<WebElement> rows,cols;
         //get rows collection from webtable
         rows = webtable.findElements(By.tagName("tr"));
         System.out.println(rows.size()-1);
         //iterate rows
         for (WebElement eachrow : rows) {
			//get cell collection frm each row
        	 cols = eachrow.findElements(By.tagName("td"));
        	 //iterate cell
        	 for (WebElement eachcol : cols) {
				//print each cell data
        		 System.out.println(eachcol.getText());
			}
        	 System.out.println("============================================================");
		}
         Thread.sleep(5000);
         driver.quit();
	}

}
