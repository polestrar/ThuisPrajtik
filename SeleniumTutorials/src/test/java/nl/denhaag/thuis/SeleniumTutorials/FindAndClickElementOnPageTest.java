/**
 * 
 */
package nl.denhaag.thuis.SeleniumTutorials;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for {@link nl.denhaag.thuis.SeleniumTutorials.FindAndClickElementOnPage}
 * @author polestrar
 *
 */
public class FindAndClickElementOnPageTest {
	
	/* Instance of webdriver*/
	
	WebDriver driver = new FirefoxDriver();
	
	/* SUT Instance for testing*/
	
	FindAndClickElementOnPage findAndClick = new FindAndClickElementOnPage();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		findAndClick.setDriver(driver);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		findAndClick.setDriver(driver);
		findAndClick.getDriver().quit();
	}

	/**
	 * Given a url for a web page
	 * When element is searched by id on the page
	 * Then it should be clicked and new page should load
	 * Test method for {@link nl.denhaag.thuis.SeleniumTutorials.FindAndClickElementOnPage#navigateToPageAndClickById(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testNavigateToPageAndClickById(){
		
	     CharSequence cs = "doodle";
	     findAndClick.navigateToPageAndClickById("https://www.google.com", "gbqfbb");
	     assertTrue("Failed to load the page,find element and click",findAndClick.getDriver().getCurrentUrl().contains(cs));
		
	}

}
