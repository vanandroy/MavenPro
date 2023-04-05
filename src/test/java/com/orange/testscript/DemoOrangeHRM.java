package com.orange.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoOrangeHRM {
	WebDriver driver;
	@Test
	public void aopenbrowser() {
		Reporter.log("aopenbrowser",true);
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    }
	@Test
	public void blogin() {
		Reporter.log("blogin",true);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).submit();
	}
	@Test
	public void cverifyMyInfo() {
		Reporter.log("cverifyMyInfo",true);
		driver.findElement(By.xpath("//span[text()='My Info' ]")).click();
		 boolean verify = driver.findElement(By.xpath("//h6[text()='Personal Details' ]")).isDisplayed();
		 System.out.println(verify);
	}
	@Test
	public void dlogout() {
		Reporter.log("dlogout",true);
		WebElement dbclk=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		Actions a=new Actions(driver);
		a.doubleClick(dbclk).perform();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	@Test
	public void ecloseBrowser() {
		Reporter.log("dcloseBrowser",true);
		driver.close();
	}
}
