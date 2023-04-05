package com.orange.generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void connectingDB() {
		
	}
	@BeforeTest
	public void openingBrowser() {
		
	}
	@BeforeClass
	public void enteringUrl() {
		
	}
	@BeforeMethod
	public void loginApplication() {
		
	}
	@AfterMethod
	public void logoutApplication() {
		
	}
	@AfterClass
	public void afterClass() {
		
	}
	@AfterTest
	public void closeBrowser() {
		
	}
	@AfterSuite
	public void closeDb() {
		
	}
}
