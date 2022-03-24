package selen.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args) throws InterruptedException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String link =("https://www.redbus.in/");
		driver.get(link);
		
		WebElement from = driver.findElement(By.id("src"));
        from.sendKeys("Tirunelveli");
        
        WebElement to = driver.findElement(By.id("dest"));
        to.sendKeys("Chennai");
		
		WebElement datebtn = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		datebtn.click();
		
		 WebElement calender = driver.findElement(By.tagName("table"));
		 List<WebElement> trows =  calender.findElements(By.tagName("tr"));
		 
		 for (WebElement a : trows) {
			 List<WebElement> tdata = a.findElements(By.tagName("td"));
		 for (WebElement b : tdata) {		
			String date = b.getText();
		 
		 
		if (date.contains("15")) {
			b.click();
		}
		 }
		 }
}
}
		 
		 
			
		
		
		
		
		
		
		/*WebElement from = driver.findElement(By.id("src"));
        from.sendKeys("Tirunelveli");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        WebElement to = driver.findElement(By.id("dest"));
        to.sendKeys("Chennai");
        Robot x = new Robot();
        x.keyPress(KeyEvent.VK_DOWN);
        x.keyRelease(KeyEvent.VK_DOWN);
        x.keyPress(KeyEvent.VK_ENTER);
        x.keyRelease(KeyEvent.VK_ENTER);
        WebElement datebtn = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        datebtn.click();
        
        WebElement calender = driver.findElement(By.tagName("table"));
        List<WebElement> dates = calender.findElements(By.tagName("tr"));
        for (int i = 0; i < dates.size(); i++) {
        	WebElement daterow = dates.get(i);
        	List<WebElement> datenum = daterow.findElements(By.tagName("td"));
        	
        for (int j = 0; j < datenum.size(); j++) {
		WebElement tradate = datenum.get(j);
		String abc = tradate.getText();
		if (abc.equals("15")) {
			tradate.click();
		}
		
			
		}
        	
			
		}

}
}*/
