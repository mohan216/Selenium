package org.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohan"
				+ "\\eclipse-workspace\\Selenium_only"
				+ "\\Day 5_Actions\\SeleniumActionsClass"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		
		System.out.println("Number of frames: " + frames.size());
		
		for (WebElement frame : frames) {
		    System.out.println("Frame name: " + frame.getAttribute("name"));
		}
		
		driver.switchTo().frame(0);
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		
		textBox.sendKeys("Hello");
	}

}
