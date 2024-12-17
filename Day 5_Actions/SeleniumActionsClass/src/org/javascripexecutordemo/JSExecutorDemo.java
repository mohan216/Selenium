package org.javascripexecutordemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohan"
				+ "\\eclipse-workspace\\Selenium_only"
				+ "\\Day 5_Actions\\SeleniumActionsClass"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//-----------------------------------------------------------
		// site 1: https://www.facebook.com/
		
		driver.get("https://www.facebook.com/");
		
		WebElement a = driver.findElement(By.id("email"));		
		WebElement b = driver.findElement(By.id("pass"));		
		WebElement c = driver.findElement(By.name("login"));
		
		// JavaScriptExecutor
		// Typecast
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value = 'vicky';",a);
		js.executeScript("arguments[0].setAttribute('value','hello');",b);
		js.executeScript("arguments[0].click();",c);
		
		//-----------------------------------------------------------
		// site 2: https://www.leafground.com/alert.xhtml
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		a = driver.findElement(By.id("j_idt88:j_idt93"));
		js.executeScript("arguments[0].click()", a);
		
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(1000);
		a1.dismiss();
		
		a = driver.findElement(By.id("j_idt88:j_idt91"));
		js.executeScript("arguments[0].click()", a);
		
		a1 = driver.switchTo().alert();
		Thread.sleep(1000);
		a1.accept();
		
		//-----------------------------------------------------------
		// site 3: https://www.flipkart.com/
		
		driver.get("https://www.flipkart.com/");
		//a = driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]"));
		a = driver.findElement(By.xpath("//a[text()='Login']"));
		
		js.executeScript("arguments[0].click()", a);
		Thread.sleep(1000);
		b = driver.findElement(By.xpath("//input[@class=\"r4vIwl BV+Dqf\"]"));
		js.executeScript("arguments[0].value='954856548';", b);
		
		//-----------------------------------------------------------
		// site 4: https://tutorialsninja.com/demo/
		driver.get("https://tutorialsninja.com/demo/");
		a = driver.findElement(By.xpath("//a[text()='About Us']"));
		js.executeScript("arguments[0].click();", a);
		Thread.sleep(1000);
		a = driver.findElement(By.xpath("//a[text()='Cameras']"));
		js.executeScript("arguments[0].click();", a);
		Thread.sleep(1000);
		a = driver.findElement(By.name("search"));
		js.executeScript("arguments[0].value='Canon EOS 5D'", a);
		Thread.sleep(1000);
		a = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
		js.executeScript("arguments[0].click();", a);
		
		//-----------------------------------------------------------
		// site 5: https://magento.softwaretestingboard.com/
		driver.get("https://magento.softwaretestingboard.com/");
		a = driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]"));
		js.executeScript("arguments[0].click();", a);
		Thread.sleep(1000);
		a = driver.findElement(By.xpath("//a[text()='Tops']"));
		js.executeScript("arguments[0].click();", a);
		Thread.sleep(1000);
		
		
	}

}
