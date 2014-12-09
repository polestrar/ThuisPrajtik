/**
 * 
 */
package nl.denhaag.thuis.SeleniumTutorials;

import org.openqa.selenium.WebDriver;

/**
 * @author poolestar
 * @see First class to learn the basics of selenium webdriver
 *
 */
public class SeleniumDriverInitializer {
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
	 * Method to navigate to given web address.
	 * @param pageUrl
	 */
	
	public void navigateToPage(String pageUrl){
		driver.navigate().to(pageUrl);
		
		
	}
 
	
}
