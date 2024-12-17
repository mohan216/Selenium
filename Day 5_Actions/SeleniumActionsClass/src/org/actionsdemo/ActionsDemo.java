package org.actionsdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohan"
				+ "\\eclipse-workspace\\Selenium_only"
				+ "\\Day 5_Actions\\SeleniumActionsClass"
				+ "\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	driver.manage().window().maximize();
	
	//context actions: drag and drop
	Actions a = new Actions(driver);
	
	WebElement src = driver.findElement(By.id("credit2"));
	
	WebElement tgt = driver.findElement(By.id("bank"));
	
	a.dragAndDrop(src, tgt).perform();
	
	src = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	
	tgt = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	
	a.dragAndDrop(src, tgt).perform();
	
	tgt = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	
	a.dragAndDrop(src, tgt).perform();
	
	src = driver.findElement(By.id("credit1"));
	
	tgt = driver.findElement(By.id("loan"));
	
	a.dragAndDrop(src, tgt).perform();
	
	//context actions: mouse hover
	
	Actions mh = new Actions(driver);
	
	driver.get("https://greenstechnologys.com/index.html");
	
	WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
	
	mh.moveToElement(courses).perform();
	
	//double click
	
	driver.get("https://www.facebook.com/");
	
	WebElement email = driver.findElement(By.id("email"));
	
	email.sendKeys("Amit");
	
	mh.doubleClick(email).perform();
		
	}
	
}
