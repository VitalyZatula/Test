package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormEdittingPage extends BasePage {
	@FindBy(css="#Event_Info")
	 WebElement evenDetails;
	@FindBy(css="#EventNameEdit")
	WebElement eventNameFld;
	@FindBy(css="#PageTitle")
	WebElement pageTitleFld;
	@FindBy(css="#EventDateTextBox")
	WebElement dateFld;
	@FindBy(css="##SaveEventInfo")
	WebElement saveBtn;
     	
	public FormEdittingPage(WebDriver driver) {
		super(driver);
		
	}
    public void goToEventDetailsTab() throws InterruptedException {
    	click(evenDetails);
    	
    	System.out.println("You are on Event Details Page");
    }
    public void editAndSaveForm(String name,String title,String date) throws InterruptedException {  	
    	fillText (eventNameFld ,name);
    	fillText (pageTitleFld ,title);    		
    	fillText (dateFld,date);	
    	click (saveBtn);
    }

}
