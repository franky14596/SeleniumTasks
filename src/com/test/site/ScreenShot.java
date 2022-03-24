package com.test.site;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Franky\\\\eclipse-workspace\\\\SeleniumTasks\\\\drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.amazon.in");
		Thread.sleep(3000);
		String title = dri.getTitle();
		
		TakesScreenshot t = (TakesScreenshot)dri;
		File source = t.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Franky\\eclipse-workspace\\SeleniumTasks\\ScreenSnaps\\amazon"+title+".png");
		
		FileUtils.copyFile(source, target);
		
		
		
		
	}

}
