package marc_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection1 {

	public static void main(String[] args) throws Throwable {
      WebDriver  driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.get("file:///D:/MultiListboxHtmlpage_lyst8730.html");
      Thread.sleep(5000);
      Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
      //verify listbox is single or multi selection listbox
      boolean value = dropdown.isMultiple();
      System.out.println(value);
      //select 0to8 items
      for(int i=0;i<=8;i++)
      {
    	  Thread.sleep(3000);
    	  //select one by on item
    	  dropdown.selectByIndex(i);
    	  }
      //deselect from selection
      dropdown.deselectByVisibleText("Yellow");
      Thread.sleep(3000);
      dropdown.deselectByIndex(0);
      Thread.sleep(3000);
      dropdown.deselectAll();
      Thread.sleep(5000);
      driver.quit();
      

	}

}
