package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectoryPage {
	@FindBy(xpath="//span[text()='Directory']")
	private WebElement directorybtn;
	
	@FindBy(xpath="//h5[text()='Directory']")
	private WebElement directorytext;
	public DirectoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setDirect() {
		directorybtn.click();
	}
	public String setverifyDirect() {
		return directorytext.getText();
		
	}

}
