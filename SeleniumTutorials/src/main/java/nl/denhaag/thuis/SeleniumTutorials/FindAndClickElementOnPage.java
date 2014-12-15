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
	 * Method to navigate to a page and click the element using id.
	 * @param pageUrl,elementId
	 */
	public void navigateToPageAndClickById(String pageUrl,String elementId){
		driver.navigate().to(pageUrl);
		driver.findElement(By.id(elementId)).click();
	}
	
	/**
	 * Method to navigate to a page and click the element using class name.
	 * @param pageUrl,elementClassName
	 * @return String (Text of the element)
	 */
	public String navigateToPageAndClickByClassName(String pageUrl,String elementClassName){
		driver.navigate().to(pageUrl);
		 return driver.findElement(By.className(elementClassName)).getText();
	}
	
	/**
	 * Method to navigate to a page and click the element using id.
	 * @param pageUrl,elementName
	 */
	public void navigateToPageAndClickByName(String pageUrl,String elementName){
		driver.navigate().to(pageUrl);
		driver.findElement(By.name(elementName)).click();
	}
	
	/**
	 * Method to navigate to a page and click the element using css selector.
	 * @param pageUrl,selector
	 */
	public void navigateToPageAndClickByCssSelector(String pageUrl,String selector){
		driver.navigate().to(pageUrl);
		driver.findElement(By.cssSelector(selector)).click();
	}
	
	/**
	 * Method to navigate to a page and click the element using xpath.
	 * @param pageUrl,selector
	 */
	public void navigateToPageAndClickByXpath(String pageUrl,String xPath){
		driver.navigate().to(pageUrl);
		driver.findElement(By.xpath(xPath)).click();
	}

}
