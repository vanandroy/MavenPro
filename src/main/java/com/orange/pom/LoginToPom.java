package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginToPom {
	@FindBy(id="username")
		private WebElement unbtx; //declaration
	
	@FindBy(name="pwd")
		private WebElement pwbtx;
	
	@FindBy(xpath="//div[text()='Login ']")
		private WebElement lgbtn;
	
	
		public LoginToPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		public void setUser(String un,String pw) {
			unbtx.sendKeys(un);  //utilization
			pwbtx.sendKeys(pw);
			lgbtn.click();
		}
	
}
