package assigment_;

import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.TestBase;
import pageLocators_Actions.TripAdvisorLocators;

public class TripAdvisor_TestCase extends TestBase {

	@Test
	public void tripAdvisor() {

		driver.get("https://www.tripadvisor.in/");
		TripAdvisorLocators tripAdvisorPage = PageFactory.initElements(driver, TripAdvisorLocators.class);
		tripAdvisorPage.tripAdisorSearch();
		tripAdvisorPage.tripAdvisorSearchButton();
		tripAdvisorPage.clickOnLink();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		tripAdvisorPage.clickOnWriteReview();
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(2));
		tripAdvisorPage.clickOnReview();
		tripAdvisorPage.writeTitle();
		tripAdvisorPage.yourReview();

	}
}
