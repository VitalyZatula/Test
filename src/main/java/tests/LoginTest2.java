package tests;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;

public class LoginTest2 extends BaseTest {


	@Test(dataProvider = "getData")
	public void loginFailure(String username,String password) {
		LoginPage login=new LoginPage(driver);
		login.loginToSystem(username,password);	
		String expected ="Sorry, either your username or password was incorrect.";
		String actual=login.getErrorMsg();
		Assert.assertEquals(actual, expected);
	}


	@Test
	public void loginSucceed() {
		LoginPage login=new LoginPage(driver);
		login.loginToSystem("shavit1986@gmail.com", "shavitdemo123");

	}

	@DataProvider
	public Object[][] getData(){
		Object[][] myData= {
				{"Vitaly","1234"},
				{"Sashka","4567"},
				{"Geleman", "78910"},
				{"Shavitsky", "0000"},
				

				
		};
		return myData;
	}
}

