package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AHomepage {
	WebDriver driver;

	@FindBy(name="field-keywords") WebElement search;
	@FindBy(id="nav-search-submit-button") WebElement searchButton ;
	
	@FindBy(className ="s-image")WebElement product ;
	@FindBy(id="add-to-cart-button")WebElement addCart ;
	
	
	public AHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Search() {
		search.click();
		search.sendKeys("phone");
		
	}
    public void  SearchButton() {
    	searchButton.click();
    		
    }
    public void  Productpage() {
    	product.click();
    		
    }
    public void  AddToCart() {
    	addCart.click();
    		
    }

}
