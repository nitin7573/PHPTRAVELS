package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.LoginPage;

public class LoginTest extends BaseTest{

	LoginPage lp;
	@BeforeClass
	public void initObject() {
		lp=new LoginPage(driver);
		
	}
	
	@Test
	public void verifyLogin() {
		lp.login("user@phptravels.com", "demouser");
		System.out.println(driver.getTitle());
		String exp="Dashboard - PHPTRAVELS";
		Assert.assertEquals(driver.getTitle(), exp);
		
		
	}
}
