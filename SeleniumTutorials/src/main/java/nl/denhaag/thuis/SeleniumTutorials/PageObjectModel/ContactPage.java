package nl.denhaag.thuis.SeleniumTutorials.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Class for representing the contact page as page object
 * @author polestrar
 *
 */
public class ContactPage extends AbstractPage {
	
	public ContactPage(WebDriver driver){
		super(driver);
	}
	
	public ContactPage fillDataInForm(){
		
		driver.findElement(By.name("name_field")).sendKeys("Test_Name");
		driver.findElement(By.name("address_field")).sendKeys("Test_Address");
		driver.findElement(By.name("postcode_field")).sendKeys("Test_PostCode");
		driver.findElement(By.name("email_field")).sendKeys("Test_Email");
		return new ContactPage(driver);
	}

	public ContactResultPage submitForm(){
		driver.findElement(By.id("submit_message")).click();
		return new ContactResultPage(driver);
	}
}
