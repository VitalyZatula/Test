package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewMyFormsPage extends BasePage {

	
	@FindBy(css="#ePlyHeader_SearchLink")
	WebElement searchAllLink;
	@FindBy(css="#ePlyHeader_accountLink")
	WebElement acountLink;
	@FindBy(css="#DateFilter")
	WebElement datesFilterDropD;
	WebElement firstForm;
	@FindBy(css="#General_Information")
	WebElement clientSetings;


	public ViewMyFormsPage(WebDriver driver) {
		super(driver);
	
		

	}
	public void openSearchAll () {
		click (searchAllLink);

	}
    public void openAcount() {
    	click (acountLink);
    }
    public void countOfAllforms(String formsDate ) throws InterruptedException {
 
    	selectByText (datesFilterDropD,formsDate);
    	
    	System.out.println("Number of all Forms is " +driver.findElements(By.cssSelector("[title='Form Setup']")).size());
    }
    public void chooseForm() {
    	firstForm=driver.findElement(By.cssSelector("[style='cursor:pointer']"));
    	click (firstForm);
    }
    
    	
}