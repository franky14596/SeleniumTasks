package selen.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

public static void main(String[] args) throws  Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String link =("https://www.flipkart.com/");
		driver.get(link);
        WebElement Xbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        Xbtn.click();
        
        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.sendKeys("fastrack");
        Thread.sleep(500);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(2000);
        
        WebElement product1 = driver.findElement(By.xpath("(//img[contains(@class,'2r')])[4]"));
        product1.click();
        
        WebElement product2 = driver.findElement(By.xpath("(//img[contains(@class,'2r')])[5]"));
        product2.click();
        
      //  String partab = driver.getWindowHandle();
      
        Set<String> alltab = driver.getWindowHandles();
        List<String> prodlist = new ArrayList<String>();
        prodlist.addAll(alltab);
        
        String buy = prodlist.get(2);
        driver.switchTo().window(buy);
        
        /*for (String a : alltab) {                 enhanced loop for set
        	if(!partab.equals(alltab)) {
        		driver.switchTo().window(a);
        	}        
        } */
        WebElement add = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        add.click();
}

}
