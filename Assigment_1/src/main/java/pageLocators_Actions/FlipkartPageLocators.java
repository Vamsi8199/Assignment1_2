package pageLocators_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlipkartPageLocators {
	public int n1;
	WebDriver driver; 	  
    public FlipkartPageLocators(WebDriver driver) { 
        this.driver = driver; 
    }

    @FindBy(how= How.XPATH, using="//input[@name=\"q\"]")
    WebElement flipkartSearch;
    @FindBy(how= How.XPATH, using="//button[@class=\"vh79eN\"]")
    WebElement flipkartSearchButton;
    @FindBy(how= How.XPATH, using="//div[@class=\"_1vC4OE _2rQ-NK\"]")
    WebElement iphonePriceInFlipkart;
    @FindBy(how=How.XPATH, using="//button[@class='_2AkmmA _29YdH8']")
    WebElement closeButton;
    
    public void closeButton() {
    	closeButton.click();
    }
    
    public void flipkartSearch() {
    	flipkartSearch.sendKeys("iPhone XR (64GB) - Yellow");
    }
    public void flipkartSearchButton() {
    	flipkartSearchButton.click();
    }
    public void iphoneSearchFlipkart() {
    	String iphonePriceFlipkart=iphonePriceInFlipkart.getText();
    	int n= iphonePriceFlipkart.length();
    	String iphonePriceFlipkart_1 = iphonePriceFlipkart.substring(1, n);
    	n1 = Integer.parseInt(iphonePriceFlipkart_1.replaceAll(",", ""));
    	//System.out.print(n1);
    }
    
}
