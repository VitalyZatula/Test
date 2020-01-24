package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ViewMyFormsPage;

public class CountOfAllForms extends BaseTest{

	
    @Test
		public void loginSucceed() {
		LoginPage login=new LoginPage(driver);
		login.loginToSystem("shavit1986@gmail.com", "shavitdemo123");
		String expected ="Hello, Shavit!";
		String actual =login.getWellcomeMsg();
		Assert.assertEquals(actual, expected);
	}
    @Test
        public void formChoosed() throws InterruptedException {
		ViewMyFormsPage formsPage=new ViewMyFormsPage (driver);
		formsPage.countOfAllforms("Show all forms");
		formsPage.chooseForm();
    }


}
