/**
 * 
 */
package nl.denhaag.thuis.SeleniumTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Polestar
 * @see First exercise to learn the basics of selenium webdriver
 *
 */
public class SeleniumDriverInitializer {

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com");

	}

}
