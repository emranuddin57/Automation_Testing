package com.us.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPracticeone {
	
	public void automationexercise() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("tanvirpatwary16@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tester01");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.close();
	}

	
	
	
	public static void main(String[] args) {
		
		JavaPracticeone obj = new JavaPracticeone ();
	obj.automationexercise();
		
	}
}
