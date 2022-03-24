package com.test.site;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavScriptExe {
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Franky\\\\eclipse-workspace\\\\SeleniumTasks\\\\drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.amazon.in");
		Thread.sleep(3000);
		
		
		WebElement Search = dri.findElement(By.id("twotabsearchtextbox"));
        JavascriptExecutor j = (JavascriptExecutor)dri;
        
        j.executeScript("arguments[0].setAttribute('value','deadpool')",Search);
        Object abc = j.executeScript("return arguments[0].getAttribute('value')",Search);
        System.out.println(abc);
        
        Thread.sleep(2000);

        // WebElement btn = dri.findElement(By.xpath("//input[@type='submit']"));
        //j.executeScript("arguments[0].click()", btn);
        
        WebElement down = dri.findElement(By.className("nav_first"));
        WebElement up   = dri.findElement(By.xpath("//h2[contains(text(),'Automotive')]"));
        
        j.executeScript("arguments[0].scrollIntoView(true)", down);
        Thread.sleep(2000);
        j.executeScript("arguments[0].scrollIntoView(false)", up);
}
}
