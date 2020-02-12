package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageObject.AccountPage;
import pageObject.LoginPage;
import pageObject.ViewMyFormsPage;

@Epic("Login and Update Contact Data")
@Feature( "User Details")
public class SaveAccountData extends BaseTest{



	@Test
	public void loginSucceed() {
		LoginPage login=new LoginPage(driver);
		login.loginToSystem("shavit1986@gmail.com", "shavitdemo123");
		String expected ="Hello, Shavit!";
		String actual =login.getWellcomeMsg();
		Assert.assertEquals(actual, expected);
	}
	
	@Severity(SeverityLevel.CRITICAL)
	@Story("I as a user would like to update my contact information ")
	@Issue("2")
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





