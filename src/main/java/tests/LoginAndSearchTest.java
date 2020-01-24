package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.SearchAllPage;
import pageObject.ViewMyFormsPage;

public class LoginAndSearchTest extends BaseTest {

	
		@Test
		public void loginAndSearch() throws InterruptedException {
		LoginPage login=new LoginPage(driver);
		login.loginToSystem("shavit1986@gmail.com", "shavitdemo123");
		ViewMyFormsPage formsPage=new ViewMyFormsPage (driver);
		formsPage.openSearchAll();
		SearchAllPage searchAll= new SearchAllPage(driver);
		searchAll.search("12/7/2016 12:00 AM", "12/7/2017 12:00 AM");
		String expected = "https://events.eply.com/Data/reports-search.aspx";
		String actual= driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
	
	
	}

}
