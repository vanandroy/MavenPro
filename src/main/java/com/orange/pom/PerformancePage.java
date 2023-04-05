package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformancePage {
	@FindBy(xpath="//span[text()='Performance']")
	private WebElement perfomancepg;
	@FindBy(xpath="//h5[text()='Employee Reviews']")
	private WebElement verifyPerformancePage;

	
	public PerformancePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void getperfomancepg() {
		perfomancepg.click();
	}
	public String getverifyperformancepage() {
		return verifyPerformancePage.getText();	
	}
}
