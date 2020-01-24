package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	//creating of web elements out of constructor
	@FindBy(css="#body_ForgotPasswordButton")
	WebElement forgotPasswordLink;
	@FindBy(css="#body_Username")
	WebElement userNameField;
	@FindBy(css="#body_Password")
	WebElement passwordField;
	@FindBy(css="#body_SubmitButton")
	WebElement submitButton;
	@FindBy(css="#body_ErrorMessage")
	WebElement errMsg;
	@FindBy(css="#ePlyHeader_FirstName")
	WebElement wellcomeMsg;
	
	
	

	public LoginPage(WebDriver driver) {
		super(driver);	
	}
	//Actions on Elements
	public void forgotPassword() {
		click (forgotPasswordLink);

	}
	public void loginToSystem (String user,String userpass) {
		fillText (userNameField,user);
		fillText (passwordField,userpass);
		click    (submitButton);
	}
	public String getErrorMsg () {
		return errMsg.getText();
	}
	public String getWellcomeMsg () {
		return wellcomeMsg.getText();
	}
}
