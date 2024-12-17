package org.selectdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("driver.chrome.webdriver", 
				"C:\\Users\\mohan\\eclipse-workspace\\Selenium_only\\Day 3&4_xpath&select_navigation"
				+ "\\select&navigation\\Driver\\chromedriver.exe");
		
		driver.get("https://www.facebook.com/");
		
		WebElement a = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]") );
		
		a.click();
		
		WebElement b = driver.findElement(By.name("firstname"));
		
		b.sendKeys("Hello321");
		
		WebElement c = driver.findElement(By.name("lastname"));
		
		c.sendKeys("everyone");
		
		// Select commands
		
		WebElement d = driver.findElement(By.id("day"));
		
		Select s1 = new Select(d);
		
		s1.selectByIndex(7);
		
		WebElement e = driver.findElement(By.id("month"));
		
		Select s2 = new Select(e);
		
		s2.selectByValue("2");
		
		WebElement f = driver.findElement(By.id("year"));
		
		Select s3 = new Select(f);
		
		s3.selectByVisibleText("2011");
		
		WebElement g = driver.findElement(By.xpath("//input[@id='sex' and @value='2']"));
		
		g.click();
		
		// sleep
		
		Thread.sleep(3000);

		//navigate commands
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Home");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		//contains text()
		
		WebElement h = driver.findElement(By.xpath("//a[contains(text(),'Already have')]"));
		
		h.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		//text and contains text()
		
		
		
		
		
	}

}
