package com.test.site;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {
	
public static void main(String[] args) throws  Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String link =("https://demo.guru99.com/test/web-table-element.php");
		driver.get(link);
		Thread.sleep(2000);
		
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> allrows = table.findElements(By.tagName("tr"));

		for (int i = 0; i < allrows.size(); i++) {
			WebElement row = allrows.get(i);
			List<WebElement> alldata = row.findElements(By.tagName("td"));
		for (int j = 0; j < args.length; j++) {
			WebElement data = alldata.get(j);
			String text = data.getText();
			System.out.println(text);
		}		
		
		}


}

}
