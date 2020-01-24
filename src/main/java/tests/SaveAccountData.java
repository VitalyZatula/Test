package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.LoginPage;
import pageObject.ViewMyFormsPage;

public class SaveAccountData extends BaseTest{



	@Test
	public void loginSucceed() {
		LoginPage login=new LoginPage(driver);
		login.loginToSystem("shavit1986@gmail.com", "shavitdemo123");
		String expected ="Hello, Shavit!";
		String actual =login.getWellcomeMsg();
		Assert.assertEquals(actual, expected);
	}		
	@Test
	public void saveAcounData() throws InterruptedException {
		ViewMyFormsPage formsPage=new ViewMyFormsPage (driver);
		formsPage.openAcount();
		AccountPage accountPage= new AccountPage (driver);
		accountPage.saveAccountData("WWW.VitalyTest.Com", "Wingate 14", "Alberta", "Canada");
		String expected ="Saved.";
		String actual =accountPage.getSaveMsg();
		Assert.assertEquals(actual, expected);

	}
}





