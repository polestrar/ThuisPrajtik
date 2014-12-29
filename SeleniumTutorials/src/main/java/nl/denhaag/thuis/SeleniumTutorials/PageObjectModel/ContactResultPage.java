package nl.denhaag.thuis.SeleniumTutorials.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * Class for representing the result page  as page object
 * @author polestrar
 *
 */
public class ContactResultPage extends AbstractPage {
	
	public ContactResultPage(WebDriver driver){
		
		super(driver);
		
	}
	
	public String getContentFromContentResultPage(){
		
		return driver.findElement(By.tagName("p")).getText();
	}
	

}
