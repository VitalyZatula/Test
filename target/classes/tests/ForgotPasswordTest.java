package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.ForgotPasswordPage;
import pageObject.LoginPage;

public class ForgotPasswordTest extends BaseTest {


	/*
	@Test
	public void loginSucceed() {
		LoginPage login=new LoginPage(driver);
		login.loginToSystem("shavit1986@gmail.com", "shavitdemo123");
		String expected ="Hello, Shavit!";
		String actual =login.getWellcomeMsg();
		Assert.assertEquals(actual, expected);
	}
	*/
	@Test
	public void enterForgotPass() {
		ForgotPasswordPage forgotpass= new ForgotPasswordPage(driver);	
		LoginPage login=new LoginPage(driver);	
		login.forgotPassword();
		forgotpass.forgotPassword("Vitaly@blyat.com");
		String actual =forgotpass.getMsg();
		String expected = "Instructions on how to reset your password have been sent to the email address registered with the username provided.";
		Assert.assertEquals(actual, expected);

	}
}

