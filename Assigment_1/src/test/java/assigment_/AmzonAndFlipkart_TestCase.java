package assigment_;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.TestBase;
import pageLocators_Actions.AmazonPageLocators;
import pageLocators_Actions.FlipkartPageLocators;

public class AmzonAndFlipkart_TestCase extends TestBase {

	@Test
	public void flipkartAndAmazon() throws Exception {

		driver.get("https://www.amazon.in");
		AmazonPageLocators amazonPage = PageFactory.initElements(driver, AmazonPageLocators.class);
		FlipkartPageLocators flipkartPage = PageFactory.initElements(driver, FlipkartPageLocators.class);
		amazonPage.amazonSearch();
		amazonPage.amazonSearchClick();
		amazonPage.priceOfiphone();
		driver.get("https://www.flipkart.com/");
		flipkartPage.closeButton();
		flipkartPage.flipkartSearch();
		flipkartPage.flipkartSearchButton();
		flipkartPage.iphoneSearchFlipkart();
		if (amazonPage.n2 < flipkartPage.n1) {
			System.out.print("The amazon website Iphone price is low " + amazonPage.n2);
		} else {
			System.out.print("The flipkart website Iphone price is low " + flipkartPage.n1);
		}

	}
}
