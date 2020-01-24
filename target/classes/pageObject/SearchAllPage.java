package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchAllPage extends BasePage {
	WebElement fromDate;
	WebElement toDate;
	WebElement searcBtn;
	WebElement spinner;


	public SearchAllPage(WebDriver driver) {
		super(driver);
		fromDate =driver.findElement(By.cssSelector("#RadFromDatePicker_dateInput"));
		toDate =driver.findElement(By.cssSelector("#RadToDatePicker_dateInput"));
		searcBtn =driver.findElement(By.cssSelector("a[id='SearchButton']"));
		//spinner=driver.findElement(By.cssSelector("#ralpLoading"));


	}
	public void search (String fromdateAndTime,String toDateAndTime) throws InterruptedException {
		fillText (fromDate, fromdateAndTime);
		fillText (toDate, toDateAndTime);
		
	
	}

	public void isSearchSucceed () {
		if (searcBtn.isEnabled());
		System.out.println("Search Availble");
		
	
	}
}


