package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHMLogOutPage {
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	private WebElement dbclk;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement lgot;
	public OrangeHMLogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setlogout() {
		lgot.click();
	}
	
	public void getDbclk(WebDriver driver) {
		Actions a=new Actions(driver);
		a.doubleClick(dbclk).perform();
	}

}
