package org.windowshandling;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohan"
				+ "\\eclipse-workspace\\Selenium_only"
				+ "\\Day 5_Actions\\SeleniumActionsClass"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("Mobiles", Keys.ENTER);
		
		List<WebElement> mobiles = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));
		
		int size = mobiles.size();
		
		String mobName = null;
		String price = null;
		
		for (int i =0; i<size; i++) {
			mobName = mobiles.get(i).getText();
			price = prices.get(i).getText();
			System.out.println(mobName + " " + "Rs. " + price.substring(1));
			System.out.println();
		}
		
		//search.sendKeys("one plus12r5g pro", Keys.ENTER);
		search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(2000);
		search.sendKeys("one plus12r5g pro", Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='OnePlus 12R (Cool Blue, 8GB RAM, 128GB Storage)'])[1]")).click();
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> windowIds = driver.getWindowHandles();
		
		for (String x: windowIds) {
			if (!parentWindowId.equals(x)) {
				driver.switchTo().window(x);
				break;
			}
		}
	
	}

}
