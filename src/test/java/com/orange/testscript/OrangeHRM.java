package com.orange.testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orange.generic.OrangeHRMBaseClass;
import com.orange.pom.DirectoryPage;
import com.orange.pom.MyInfoPage;
import com.orange.pom.PerformancePage;
@Listeners(com.orange.generic.ListenerImplementationClass.class)
public class OrangeHRM extends OrangeHRMBaseClass  {
	WebDriver d;
	@Test
	public void verifyMyInfo() throws InterruptedException {
		d = super.driver;
		MyInfoPage m=new MyInfoPage(driver);
		m.getmyinfoclick();
	      boolean verify = m.getverifyMyInfo();
	      System.out.println(verify);
	}
	@Test
	public void verifyPerformance() {
		PerformancePage p=new PerformancePage(driver); 
		p.getperfomancepg();
		String verify = p.getverifyperformancepage();
		System.out.println(verify);
		}
	@Test
	public void verifyDirectoryPage() {
		DirectoryPage p=new DirectoryPage(driver);
		p.setDirect();
		String title=p.setverifyDirect();
		System.out.println(title);
		
	}
}
