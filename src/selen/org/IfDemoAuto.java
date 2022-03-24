package selen.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfDemoAuto {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String link =("http://demo.automationtesting.in/Register.html");
		driver.get(link);
		
		WebElement opt1 = driver.findElement(By.xpath("//input[@value='Male']"));
		opt1.click();
		String val = opt1.getAttribute("class");
		if (val.contains("parse")) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL");
		}
}
}
