package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {

	WebDriver driver;
	JavascriptExecutor js;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);


		// here we initiate the JavascriptExecutor to use it any time we need to run a javascript
		js=(JavascriptExecutor)driver;
	}

	public void click (WebElement el) {
		highlightElement(el,"#7FFFD4");
		el.click();
	}

	public void fillText (WebElement el,String text) {
		highlightElement(el,"red");
		el.clear();
		el.sendKeys(text);
	}

	public void selectByText (WebElement el, String text) {
		Select select = new Select(el);
		select.selectByVisibleText(text);
	}

	public void selectIndex (WebElement el, int i) {
		Select select = new Select(el);
		select.selectByIndex(i);
	}


	/*
	 * call this method with your element and a color you like (red, green, orange, blue etc...)
	 */
	protected void highlightElement(WebElement element, String color) {
		//keep the old style to change it back
		String originalStyle = element.getAttribute("style");
		String newStyle = "border: 3px solid " + color + ";" + originalStyle;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Change the style 
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '" + newStyle + "');},0);",
				element);

		// Change the style 
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '" + originalStyle + "');},800);",element);

	}
}