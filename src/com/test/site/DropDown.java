package com.test.site;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*String link =("https://demo.guru99.com/test/newtours/register.php");
		driver.get(link);
		driver.manage().window().maximize();
		
	WebElement dropdown = driver.findElement(By.name("country"));
	Select s = new Select(dropdown);
	s.selectByIndex(5);
	List<WebElement> x = s.getOptions();
	
	for (WebElement a : x) {
		String abc = a.getText();
	System.out.println(abc);
	}*/
		
	/*	driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		WebElement options = driver.findElement(By.name("multipleselect[]"));
		Select s = new Select(options);
		s.selectByIndex(1);
		s.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		s.deselectAll();*/
		
	/*	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropdown = driver.findElement(By.tagName("select"));
		Select s = new Select(dropdown);
		s.selectByIndex(5);
		s.selectByValue("AUS");
		s.selectByVisibleText("Brazil");
		boolean multiple = s.isMultiple();
		System.out.println("Multi:" + multiple);
		List<WebElement> x = s.getOptions();
		for (WebElement a : x) {
			String z = a.getText();
          System.out.println(z);  */
		
		
		
		//    UNDER PROGRESS
		
		/*driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement dropdown = driver.findElement(By.tagName("select"));
		Select month = new Select(dropdown);
		month.selectByIndex(3);
		month.selectByValue("5");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@class,'year')]"));
		Select year = new Select(dropdown1);
		year.selectByValue("1996");
		//driver.findElement(By.xpath("(//div[@role='option'])[16]")).click();
		driver.findElement(By.xpath("//div[text()='10']")).click();
		
		WebElement statedrop = driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']"));
		Select sdrop = new Select(statedrop);
		sdrop.selectByIndex(2);*/
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement options = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		JavascriptExecutor j =(JavascriptExecutor)options;
		j.executeScript("arguments[0].scrollIntoView(true)", options);
		
		driver.findElement(By.xpath("(//input[@name='tool'])[3]")).click();
		
		
		
		
		
		
		
		
		}
		
}
