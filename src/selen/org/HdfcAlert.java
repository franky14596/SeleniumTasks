package selen.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.site.Alerts;

public class HdfcAlert {
	
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
    
	driver.switchTo().frame(0);
    WebElement btn = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
	btn.click();
	Thread.sleep(2000);
	
    Alert a = driver.switchTo().alert();
    a.accept();
}
}
