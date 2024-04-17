package mar_27;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangehrm {

	public static void main(String[] args)throws Throwable {
		FileReader fr = new FileReader("D:/loginorangehrm.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str=br.readLine())!=null) {
			String login[] = str.split(";");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
		driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
		driver.findElement(By.name("Submit")).click();
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if (Actual.contains(Expected)) {
			System.out.println("Login Is Successful");
		} 
		else 
		{
            System.out.println("Login Is Not Successful");
		}
		driver.quit();
		}
		

	}

}
