package pageLocators_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonPageLocators {
	
	public int n2;

	WebDriver driver;

	public AmazonPageLocators(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='twotabsearchtextbox']")
	WebElement amazonSearch;
	@FindBy(how = How.XPATH, using = "//input[@type=\"submit\"][@class=\"nav-input\"]")
	WebElement amazonSearchButton;
	@FindBy(how = How.XPATH, using = "(//div[@class=\"sg-row\"]/..//span[@class=\"a-price-whole\"])[1]")
	WebElement iphonePriceInAmazon;
	
	public void amazonSearch() {
		amazonSearch.sendKeys("iPhone XR (64GB) - Yellow");
	}
	public void amazonSearchClick() {
		amazonSearchButton.click();
	}
	public void priceOfiphone() {
		String amazonIphonePrice = iphonePriceInAmazon.getText();
		n2= Integer.parseInt(amazonIphonePrice.replaceAll(",", ""));
		//System.out.println(n2);
	}

}
