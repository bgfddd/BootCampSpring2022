package Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpidiaPage {
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Flights']") WebElement flights;
	@FindBy(id="location-field-leg1-origin") WebElement leavingfrom ;
	@FindBy(id=" location-field-leg1-origin-menu")  WebElement austin ;
	@FindBy(id="location-field-leg1-destination") WebElement goingto ;
	@FindBy(id="wizard-flight-tab-roundtrip")WebElement departing ;
	@FindBy(xpath="location-field-leg1-destination-result-item-button")WebElement virginia ;
	@FindBy(xpath="//button[@aria-label='Jul 4, 2022 selected, current check in date.']")WebElement returning ;
	@FindBy(xpath="//*[@id=\"wizard-flight-tab-roundtrip\"]/div/div/div/div/div/div/div/div/div/button")WebElement Donebutton ;
	@FindBy(xpath="//span[text()='Roundtrip']")WebElement roundtrip;
	@FindBy(xpath="searchButton") WebElement searchButton;
	public   ExpidiaPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Flights() {
		flights.click();
		 
	}
	
	public void Leaving() {
		leavingfrom.click();
		leavingfrom.sendKeys("Austin");
		Austin();
		
	}
	public void Austin() {
		austin.click();
	}
	
	
    public void  Going() {
    	leavingfrom.click();
    	leavingfrom.sendKeys("Verginia");
    	Virginia();
	} 
    public void Virginia() {
		virginia.click();
	}
    
    public void  Departing() {
		departing.click();
		Donebutton.click();
    	
		
	} 
	
	 public void  Returning() {
		 returning.click();
		 DoneButton();	
			
		} 
    
	 public void  DoneButton() {
		 
		 Donebutton.click();	
			
		} 

}
