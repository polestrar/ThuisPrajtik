package nl.denhaag.thuis.SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Class for locating and performing operations on elements
 * @author polestar
 */

public class FindAndClickElementOnPage {
	
	/*Driver instance for a browser*/
	private WebDriver driver;
	
	/*Method to get the driver instance*/
	public WebDriver getDriver() {
		return driver;
	}
	
	/*Method to set the driver instance*/

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Method to navigate to a page and click the element.
	 * @param pageUrl,elementId
	 */
	public void navigateToPageAndClickById(String pageUrl,String elementId){
		driver.navigate().to(pageUrl);
		driver.findElement(By.id(elementId)).click();
	}

}
