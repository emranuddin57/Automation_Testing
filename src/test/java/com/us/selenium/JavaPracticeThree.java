package com.us.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaPracticeThree {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

driver.get("https://www.target.com/");	
driver.manage().window().maximize();
driver.manage().window().fullscreen();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@class='styles__LinkText-sc-u2k6h-3 kzpXPc h-margin-r-x3']")).click();
driver.findElement(By.xpath("(//span[@class='styles__ListItemText-sc-diphzn-1 eOhzvD'])[1]")).click();
driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("seleniumb34@gmail.com");
	}

}
