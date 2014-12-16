/**
 * 
 */
package nl.denhaag.thuis.SeleniumTutorials;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static junitparams.JUnitParamsRunner.$;


/**
 * Unit test for {@link nl.denhaag.thuis.SeleniumTutorials.FindAndClickElementOnPage}
 * @author polestrar
 *
 */
@RunWith(JUnitParamsRunner.class)
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
	 * Method to feed in data for parameterized test case
	 * @return array of object containing relevant data
	 */
	private static final Object[] getPageAndElement() {
		return  $(
		$("https://www.google.com/en", "gbqfbb"),
		$("https://www.google.com/nl", "gbqfbb")
		);
		}

	/**
	 * Given a url for a web page
	 * When element is searched by id on the page
	 * Then it should be clicked and new page should load
	 * Test method for {@link nl.denhaag.thuis.SeleniumTutorials.FindAndClickElementOnPage#navigateToPageAndClickById(java.lang.String, java.lang.String)}.
	 */
	
	@Test
	@Parameters(method = "getPageAndElement")
	public void testNavigateToPageAndClickById(String pageUrl,String elementId){
		
	     CharSequence cs = "doodle";
	     findAndClick.navigateToPageAndClickById(pageUrl, elementId);
	     assertTrue("Failed to load the page,find element and click",findAndClick.getDriver().getCurrentUrl().contains(cs));
		
	}

	
	/**
	 * Given a url for a web page
	 * When element is searched by class name  on the page
	 * Then it should be clicked and text of the element should be returned
	 * Test method for {@link nl.denhaag.thuis.SeleniumTutorials.FindAndClickElementOnPage#navigateToPageAndClickByClassName(java.lang.String, java.lang.String)}.
	 */
	
	@Test
	public void testNavigateToPageAndClickByClassName(){
		
	     CharSequence cs = "Google zoeken";
	     assertTrue("Failed to load the page,find element and click",findAndClick.navigateToPageAndClickByClassName("https://www.google.com", "gbqfba").contains(cs));
		
	}
	
	/**
	 * Given a url for a web page
	 * When element is searched by name on the page
	 * Then it should be clicked and new page should load
	 * Test method for {@link nl.denhaag.thuis.SeleniumTutorials.FindAndClickElementOnPage#navigateToPageAndClickByName(java.lang.String, java.lang.String)}.
	 */
	
	@Test
	public void testNavigateToPageAndClickByName(){
	     CharSequence cs = "doodle";
	     findAndClick.navigateToPageAndClickByName("https://www.google.com", "btnI");
	     assertTrue("Failed to load the page,find element and click",findAndClick.getDriver().getCurrentUrl().contains(cs));
		
	}
	/**
	 * Given a url for a web page
	 * When element is searched by css selector on the page
	 * Then it should be clicked and new page should load
	 * Test method for {@link nl.denhaag.thuis.SeleniumTutorials.FindAndClickElementOnPage#navigateToPageAndClickByCssSelector(java.lang.String, java.lang.String)}.
	 */
	
	@Test
	public void testNavigateToPageAndClickByCssSelector(){
	     CharSequence cs = "doodle";
	     findAndClick.navigateToPageAndClickByCssSelector("https://www.google.com", "[id=gbqfbb]");
	     assertTrue("Failed to load the page,find element and click",findAndClick.getDriver().getCurrentUrl().contains(cs));
		
	}
	
	/**
	 * Given a url for a web page
	 * When element is searched by css selector on the page
	 * Then it should be clicked and new page should load
	 * Test method for {@link nl.denhaag.thuis.SeleniumTutorials.FindAndClickElementOnPage#navigateToPageAndClickByXpath(java.lang.String, java.lang.String)}.
	 */
	
	@Test
	public void testNavigateToPageAndClickByXpath(){
	     CharSequence cs = "doodle";
	     findAndClick.navigateToPageAndClickByXpath("https://www.google.com", "//*[@id='gbqfbb']");
	     assertTrue("Failed to load the page,find element and click",findAndClick.getDriver().getCurrentUrl().contains(cs));
		
	}
	
}
