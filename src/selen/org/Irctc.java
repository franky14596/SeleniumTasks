package selen.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String link =("https://irctc.co.in/");
	driver.get(link);
	Thread.sleep(3000);
	WebElement okbtn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	okbtn.click();
	
	WebElement from =driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
	from.sendKeys("TIRUNELVELI - TEN");
	from.sendKeys(Keys.ARROW_DOWN);
	from.sendKeys(Keys.ENTER);
	
	WebElement to =driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));	
	to.sendKeys("CHENNAI EGMORE - MS");
	to.sendKeys(Keys.ARROW_DOWN);
	to.sendKeys(Keys.ENTER);
	
}
}
