/**
 * 
 */
package nl.denhaag.thuis.SeleniumTutorials.PageObjectModel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * Unit test cases to for page object model concept
 * @author polestrar
 *
 */
public class PageObjectModelTest {

	/**
	 * Setting up the driver instance
	 * @throws java.lang.Exception
	 */
	
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	/**
	 * Closing the open driver session
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void shouldSendContactMessage() {
		HomePage onHomePage = new HomePage(driver);
		onHomePage = onHomePage.navigateToSiteHomePage();
		ContactPage onContactPage = onHomePage.clickOnContact();
		ContactResultPage onContactResultPage = onContactPage.fillDataInForm().submitForm();
		assertTrue(onContactResultPage.getContentFromContentResultPage().contains("Many thanks for your message"));
	}

}
