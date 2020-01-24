package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
	@FindBy(css="#Website")
	WebElement websiteFld;
	@FindBy(css="#Address")
	WebElement streetAddressFld;
	@FindBy(css="#Province")
	WebElement provinceDropD;
	@FindBy(css="#Country")
	WebElement countryDropD;
	@FindBy(css="#Button2")
	WebElement saveBtn;
	@FindBy(css="#UpdateClientError")
	WebElement savedMsg;

	public AccountPage(WebDriver driver) {
		super(driver);
		
		
	
    	
	}
	public void saveAccountData (String webAddress,String streetAdress,String province,String country) throws InterruptedException {
		fillText (websiteFld,webAddress);
		fillText (streetAddressFld,streetAdress);
		selectByText (provinceDropD,province);
		selectByText (countryDropD,country);
		click (saveBtn);
		
	
	}
		public String getSaveMsg (){
			return savedMsg.getText();


		}
}