package com.test.site;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Franky\\\\eclipse-workspace\\\\SeleniumTasks\\\\drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target1 = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		WebElement source2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target2 = driver.findElement(By.xpath("//ol[@id='loan']/li"));
		WebElement source3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement target4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(source1, target1).perform();
		a.dragAndDrop(source2, target2).perform();
		a.dragAndDrop(source3, target3).perform();
		a.dragAndDrop(source3, target4).perform();
		
		WebElement btn = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		btn.getText("");
	}
}
