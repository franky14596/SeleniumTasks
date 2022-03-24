package selen.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String link =("http://demo.automationtesting.in/Register.html");
		driver.get(link);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@type='text'][1]"));
		firstname.sendKeys("Franky");
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastname.sendKeys("Jones");
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("Tirunelveli");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("abc@gmail.com");
		WebElement phno = driver.findElement(By.xpath("//input[@type='tel']"));
		phno.sendKeys("123456789");
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radio.click();
		WebElement Hob1 = driver.findElement(By.id("checkbox1"));
		Hob1.click();
		WebElement Hob2 = driver.findElement(By.id("checkbox2"));
		Hob2.click();
		WebElement lang = driver.findElement(By.id("msdd"));
		lang.click();
		WebElement langopt = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));
		langopt.click();
		
	
	}
}
