package com.us.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPracticeFour {
	public void orangehrm() throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2000);
driver.manage().window().maximize();
 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
 driver.findElement(By.xpath("//button[@type='submit']")).click();
 driver.close();
 


	    
	}
	public static void main(String[] args) throws InterruptedException {
		JavaPracticeFour obj = new JavaPracticeFour();
	obj.orangehrm();
		
	}
}
