package nl.denhaag.thuis.SeleniumTutorials.PageObjectModel;

import org.openqa.selenium.WebDriver;

/**
 * Model page to start setting up the across session driver and navigating to home page
 * @author polestrar
 *
 */
public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public HomePage navigateToSiteHomePage(){
		driver.navigate().to("http://www.thetestroom.com/webapp/index.html");
		return new HomePage(driver);
	}

}
