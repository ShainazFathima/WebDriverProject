package mar_27;
import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import mar_28.WebdriverExplicitWait;

public class Writing {

	public static void main(String[] args) throws Throwable{
		//create a file
     File f = new File("D:/bank.txt");
     FileWriter fw = new FileWriter(f);
     BufferedWriter bw = new BufferedWriter(fw);
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://primusbank.qedgetech.com/");
     Thread.sleep(5000);
     String para1=driver.findElement(By.xpath("//p[contains(text(),'Primus Bank dates back to 1955 when Primus North C')]")).getText();
     String para2=driver.findElement(By.xpath("//p[contains(text(),'In 1975, the Malta Government purchased 25% of')]")).getText();
     
     bw.write(para1);
     bw.newLine();
     bw.newLine();
     bw.write(para2);
     bw.flush();
     bw.close();
		}
		
		
	}


