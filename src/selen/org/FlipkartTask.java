package selen.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTask {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String link =("https://www.flipkart.com/");
		driver.get(link);

		WebElement closebtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		closebtn.click();
		
		WebElement tof = driver.findElement(By.xpath("//div[text()='Top Offers']"));
		String a = tof.getText();
		System.out.println(a);
		
		WebElement Fash = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Fash).perform();
		
		WebElement MenFash = driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		act.moveToElement(MenFash).perform();
		
		WebElement MCS = driver.findElement(By.xpath("//a[contains(text(),'s Casual Shoes')]"));
		MCS.click();
		
		
		
}

}
