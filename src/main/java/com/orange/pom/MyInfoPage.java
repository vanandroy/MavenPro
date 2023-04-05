package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {
	@FindBy(xpath="//span[text()='My Info' ]")
	private WebElement myInfoClick;
	@FindBy(xpath="//h6[text()='Personal Details' ]")
	private WebElement verifyMyInfo;
	public MyInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void getmyinfoclick() {
		myInfoClick.click();
	}
	public boolean getverifyMyInfo() {
		return verifyMyInfo.isDisplayed();
	}

}
