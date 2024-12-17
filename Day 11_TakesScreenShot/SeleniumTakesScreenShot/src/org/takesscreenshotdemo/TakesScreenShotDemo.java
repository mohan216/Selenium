package org.takesscreenshotdemo;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShotDemo {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohan"
				+ "\\eclipse-workspace\\Selenium_only"
				+ "\\Day 5_Actions\\SeleniumActionsClass"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File trgFile = new File("C:\\Users\\mohan\\OneDrive\\Desktop\\Java Selenium Course (Selenium)\\Day11_takescreenshot\\t1.jpeg");
		FileUtils.copyFile(srcFile, trgFile);//IO Exception
		
		//ScreenShot 2
		//WebElement a = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		WebElement a = driver.findElement(By.partialLinkText("te a Page"));
		a.click();
		srcFile = ts.getScreenshotAs(OutputType.FILE);
		trgFile = new File("C:\\Users\\mohan\\OneDrive\\Desktop\\Java Selenium Course (Selenium)\\Day11_takescreenshot\\t2.jpeg");
		FileUtils.copyFile(srcFile, trgFile);//IO Exception
		
		//ScreenShot 3
		driver.get("https://www.leafground.com/alert.xhtml");
		srcFile = ts.getScreenshotAs(OutputType.FILE);
		trgFile = new File("C:\\Users\\mohan\\OneDrive\\Desktop\\Java Selenium Course (Selenium)\\Day11_takescreenshot\\t3.jpeg");
		FileUtils.copyFile(srcFile, trgFile);//IO Exception
		
		
		List<Character> chars = new LinkedList<>();
		
	}
}
