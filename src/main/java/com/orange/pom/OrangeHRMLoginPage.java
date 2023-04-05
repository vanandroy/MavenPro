package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {
	@FindBy(xpath="//input[@name='username']")
	private WebElement unbx;
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwbx;
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement lgbx;
	public OrangeHRMLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void LoginOrangeHM_POM_Class(String un,String pw) {
		unbx.sendKeys(un);
		pwbx.sendKeys(pw);
		lgbx.submit();
		
	}

}
