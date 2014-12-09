package nl.denhaag.thuis.SeleniumTutorials;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Test class for selenium webdriver initilization
 * 
 * @author polestrar
 * 
 * 
 */
public class SeleniumDriverInitializerTest {

	/* Driver instance for testing */
	private WebDriver driver = new FirefoxDriver(); ;
	
	/*SUT instance for testing */
	SeleniumDriverInitializer initializer = new SeleniumDriverInitializer();

	/* Method to run before each test method call */
	@Before
	public void setUp() throws Exception {

		initializer.setDriver(driver);

	}
	/* Method to run after each test method call */
	@After
	public void tearDown() throws Exception {
		
		initializer.setDriver(driver);
		initializer.getDriver().quit();
		

	}

	/**
	 * <br>Given a url of a web address </br>
	 * <br>When made to navigate to the address</br>
	 * <br>Then the page corresponding to address should load</br>
	 * @link nl.denhaag.thuis.SeleniumTutorials#navigateToPage(String)
	 */
	@Test
	public void testShouldNavigateToGivenPage() {

		final CharSequence urlCharSequence = "google.nl";
		initializer.navigateToPage("https://www.google.com");
		assertTrue("Navigation to given page failed",initializer.getDriver().getCurrentUrl().contains(urlCharSequence));
		
	}

}
