package com.orange.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.orange.pom.OrangeHMLogOutPage;
import com.orange.pom.OrangeHRMLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMBaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	@Parameters({"browserName"})
	@BeforeClass
	public void openBrowser(String browserName) {
		//		switch (browserName) {
		//		case "chrome":
		//			WebDriverManager.chromedriver().setup();
		//			driver=new ChromeDriver();
		//			break;
		//		case "firefox":
		//			WebDriverManager.firefoxdriver().setup();
		//			driver=new FirefoxDriver();
		//			break;
		//		case "edge":
		//			WebDriverManager.edgedriver().setup();
		//			driver=new EdgeDriver();
		//			break;
		//
		//		default:
		//			System.out.println("browser name is invalid");
		//			break;
		//		}
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Browser is not Found");
		}
		sdriver=driver;
		driver.manage().window().maximize();
		driver.get(IPathConstants.url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void loginPage() {
		OrangeHRMLoginPage log=new OrangeHRMLoginPage(driver);
		log.LoginOrangeHM_POM_Class(IPathConstants.userName,IPathConstants.password);
	}
	@AfterMethod
	public void logout() {
		OrangeHMLogOutPage l=new OrangeHMLogOutPage(driver);
		l.getDbclk(driver);
		l.setlogout();
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();

	}





}
