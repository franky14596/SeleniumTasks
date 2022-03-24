package selen.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	String link = new String("https://www.facebook.com");
	driver.get(link);
	
	Thread.sleep(3000);
	
	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	username.sendKeys("Anto Franklin");
	String abc = username.getAttribute("value");
	System.out.println(abc);
	
	
	//username.sendKeys("Anto Franklin");
	
	WebElement pswrd = driver.findElement(By.xpath("//input[@type='password']"));
	pswrd.sendKeys("123454321");
	
	WebElement btn = driver.findElement(By.xpath("//button[@value='1']"));
	btn.click();//
	
	}
}

