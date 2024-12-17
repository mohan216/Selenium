package org.alertdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohan"
				+ "\\eclipse-workspace\\Selenium_only"
				+ "\\Day 5_Actions\\SeleniumActionsClass"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//Simple alert	-------------------------------------------------------------
		WebElement a1 = driver.findElement(By.id("j_idt88:j_idt91"));		
		a1.click();
		
		Alert a2 = driver.switchTo().alert();		
		Thread.sleep(1000);
		a2.accept();
		
		//Confirm alert		-------------------------------------------------------------
		a1 = driver.findElement(By.id("j_idt88:j_idt93"));
		a1.click();
		
		a2 = driver.switchTo().alert();
		Thread.sleep(1000);
		a2.dismiss();
		
		//Prompt alert		-------------------------------------------------------------
		a1 = driver.findElement(By.id("j_idt88:j_idt104"));
		a1.click();
		
		a2 = driver.switchTo().alert();
		Thread.sleep(1000);
		a2.sendKeys("Hello");
		a2.accept();
		
		//Sweet alert simple dialogue   -------------------------------------------------
		a1 = driver.findElement(By.id("j_idt88:j_idt95"));
		a1.click();
		
		WebElement closeButton1 = driver.findElement(By.cssSelector(".ui-dialog-titlebar-close"));
        closeButton1.click();
        
        //Sweet alert modal dialogue -------------------------------------------------------------
        
        a1 = driver.findElement(By.id("j_idt88:j_idt95"));
		a1.click();
		
		WebElement closeButton2 = driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[1]"));
        closeButton2.click();
        
        //Sweet alert confirmation -------------------------------------------------------------
        
        a1 = driver.findElement(By.id("j_idt88:j_idt106"));
		a1.click();
		
		WebElement closeButton3 = driver.findElement(By.id("j_idt88:j_idt108"));
        closeButton3.click();
        
        //Sweet alert minimize and maximize -------------------------------------------------------------
        
        a1 = driver.findElement(By.id("j_idt88:j_idt111"));
		a1.click();
		
		WebElement minimize = driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-minimize ui-corner-all']"));
        minimize.click();
        Thread.sleep(2000);
        
        WebElement maximize = driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all']"));
        maximize.click();
        Thread.sleep(2000);
        
        WebElement closeButton4 = driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[3]"));
        closeButton4 .click();
        Thread.sleep(2000);
		
	}

}
