package selen.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi {
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");

   WebElement btn1 = driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']"));
   btn1.click();

   WebElement btn2 = driver.findElement(By.xpath("//input[@type='submit']"));
   btn2.click();
   Thread.sleep(2000);

   Alert a = driver.switchTo().alert();
   a.accept();
}
}