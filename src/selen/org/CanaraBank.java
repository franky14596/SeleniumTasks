package selen.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanaraBank {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	
	WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
     JavascriptExecutor j = (JavascriptExecutor)driver;
     
     j.executeScript("arguments[0].scrollIntoView(true)", btn );
     
     btn.click();
     Thread.sleep(500);
     
     Alert a = driver.switchTo().alert();
     a.accept();
}
}
