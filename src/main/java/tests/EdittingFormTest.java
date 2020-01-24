package tests;

import org.testng.annotations.Test;

import pageObject.FormEdittingPage;
import pageObject.LoginPage;
import pageObject.ViewMyFormsPage;

public class EdittingFormTest extends BaseTest {

	
		@Test
		public void loginSucceed() {
			LoginPage login=new LoginPage(driver);
			login.loginToSystem("shavit1986@gmail.com", "shavitdemo123");
			//TASKKILL /F /IM chromedriver.exe /t
		}
		@Test 
		public void openForms ( ) throws InterruptedException {
		ViewMyFormsPage formsPage=new ViewMyFormsPage (driver);
		formsPage.countOfAllforms("Show all forms");
		formsPage.chooseForm();
		}
		@Test
		public void EditForm() throws InterruptedException {
		FormEdittingPage editPage= new FormEdittingPage (driver);
		editPage.editAndSaveForm("Test10", "Vitaly's Test", "12:00");

		}
		
	


}
