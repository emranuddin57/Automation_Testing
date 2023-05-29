package com.us.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPracticetwo {

	public void practicetestautomation() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		 //driver.get("https://practicetestautomation.com/");
		driver.manage().window().maximize();
		
	    // driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
        driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")).click();
        //driver.close();
        driver.quit();
	}
	
	public void automationexercise() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("tanvirpatwary16@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tester01");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.close();
	}
	
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
		JavaPracticetwo obj = new JavaPracticetwo();
		obj.practicetestautomation();
		obj.automationexercise();
		obj.orangehrm();
	}
}
