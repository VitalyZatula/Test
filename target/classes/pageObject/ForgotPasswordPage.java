package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {

	//creating web Elements
	@FindBy(css="#body_Username")
	WebElement username;
	@FindBy(css="#body_SubmitButton")
	WebElement submit;
	@FindBy(css="#body_Username")
	WebElement msg;
	

	public ForgotPasswordPage(WebDriver driver) {
		super (driver);

		

		
	}
    //Actions on Elements
	public void forgotPassword(String user) {
		fillText(username,user);
		click (submit);
	
	}
	
	
	
	public String getMsg() {
		
		msg=driver.findElement(By.cssSelector("#body_Message"));	
		return msg.getText();
	}


}
