package tests;


import org.testng.Assert;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;

public class LoginTest extends BaseTest {


	@Test(dataProvider="getDataFromexcell")
	public void loginFailure(String user ,String password) {
		LoginPage login=new LoginPage(driver);
		login.loginToSystem(user, password);	
		String expected ="Sorry, either your username or password was incorrect.";
		String actual=login.getErrorMsg();
		Assert.assertEquals(actual, expected);
	}
	
	
	/*@Test
	public void loginSucceed() {
		LoginPage login=new LoginPage(driver);
		login.loginToSystem("shavit1986@gmail.com", "shavitdemo123");
		
	}
*/
	//@DataProvider Object [][] getDataFromexcell(){
		//String excelPath =System.getProperty("");
	//	Object [][]table =Excel.getTableArray(excelPath,"Login'");
		
				
	//}
}

