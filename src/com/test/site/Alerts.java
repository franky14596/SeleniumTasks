package com.test.site;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	//Alert with ok
	//WebElement btn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	//btn.click();
	//Thread.sleep(2000);
	
	//Alert with ok and cancel
	//WebElement btn2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	//btn2.click();
	//Thread.sleep(1000);
	
	//WebElement btn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	//btn.click();
	//Thread.sleep(500);
	
	//Alert with text
	WebElement btn3 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	btn3.click();
	Thread.sleep(1000);
	
	WebElement btn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	btn.click();
	Thread.sleep(1000);
	
	Alert a = driver.switchTo().alert();
	a.sendKeys("Franky");
	a.accept();
	
	
	WebElement abc = driver.findElement(By.id("demo1"));
    String ab = abc.getText();
    System.out.println(ab);
    boolean x = ab.contains("Franky");
	System.out.println(x);
	}

}