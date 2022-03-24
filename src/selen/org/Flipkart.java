package selen.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String link =("https://www.flipkart.com/");
		driver.get(link);
		
		WebElement login = driver.findElement(By.className("_14Me7y"));
		login.click();
		
		WebElement enternum = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		enternum.sendKeys("7543892515");
		
		WebElement contbtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		contbtn.click();
		
		Thread.sleep(2000);
		
		WebElement otp = driver.findElement(By.className("(//input[@type='text'])[3]"));
		otp.sendKeys("4654646");
		
		WebElement pswrd = driver.findElement(By.xpath("(//input[@type='password'])"));
		pswrd.sendKeys("316564dfsd");
		
		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();

}
}
