package pageLocators_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TripAdvisorLocators {
	WebDriver driver;

	public TripAdvisorLocators(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@type='search'][@name='q']")
	WebElement tripAdvisroSearch;
	@FindBy(how = How.XPATH, using = "//span[@class='_2LyoLJ4U _2HBN-k68']")
	WebElement tripAdvisorSearchButton;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Club Mahindra Madikeri, Coorg')]")
	WebElement clickOnLink;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Write a review')]")
	WebElement writeReview;
	@FindBy(how = How.XPATH, using = "//span[@id='bubble_rating']")
	WebElement clickOnRating;
	@FindBy(how = How.XPATH, using = "//input[@id='ReviewTitle']")
	WebElement writeTitle;
	@FindBy(how = How.XPATH, using = "//textarea[@id='ReviewText']")
	WebElement yourReview;

	public void tripAdisorSearch() {
		tripAdvisroSearch.sendKeys("Club Mahindra");
	}

	public void tripAdvisorSearchButton() {
		tripAdvisorSearchButton.click();
	}

	public void clickOnLink() {
		clickOnLink.click();
	}

	public void clickOnWriteReview() {
		writeReview.click();
	}

	public void clickOnReview() {
		Actions actions = new Actions(driver);
		actions.moveToElement(clickOnRating);
		actions.click().perform();
	}

	public void writeTitle() {
		writeTitle.sendKeys("Testing purpose");
	}

	public void yourReview() {
		yourReview.sendKeys("Testing purpose");

	}

}
