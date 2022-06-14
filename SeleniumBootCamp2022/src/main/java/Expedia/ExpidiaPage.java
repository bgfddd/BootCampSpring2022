package Expedia;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpidiaPage {
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Flights']") WebElement flights;
	@FindBy(xpath="//button[@aria-label='Leaving from']") WebElement leavingfrom ;
	@FindBy(id="location-field-leg1-origin") WebElement leavingInput ;
	@FindBy(id=" location-field-leg1-origin-menu")  WebElement austin ;
	@FindBy(xpath="//button[@aria-label='Going to']") WebElement goingto ;
	@FindBy(id="location-field-leg1-destination") WebElement goingInput ;
	@FindBy(id="d1-btn") WebElement depClick ;
	@FindBy(xpath="(//*[@data-day='24'])[1]")WebElement departing ;
	@FindBy(xpath="location-field-leg1-destination-result-item-button")WebElement virginia ;
	@FindBy(id="d2-btn") WebElement retClick ;
	@FindBy(xpath="(//*[@data-day='31'])[1]")WebElement returning ;
	@FindBy(xpath="//*[@id=\"wizard-flight-tab-roundtrip\"]/div/div/div/div/div/div/div/div/div/button")WebElement Donebutton ;
	@FindBy(xpath="//span[text()='Roundtrip']")WebElement roundtrip;
	@FindBy(xpath="//button[text()='Search']") WebElement searchButton;
	@FindBy(className ="uitk-card-link") WebElement flightTrip;
	@FindBy(id="home_children_button")  WebElement verify;
	public   ExpidiaPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Flights() {
		flights.click();
		
	}
	
	public void Leaving() {
		leavingfrom.click();
		leavingInput.sendKeys("Austin, TX (AUS-Austin-Bergstrom Intl.)");
		leavingInput.sendKeys(Keys.ENTER);
		
		
	}
	public void Austin() {
		austin.click();
	}
	
	
    public void  Going() {
    	goingto.click();
    	goingInput.sendKeys("Norfolk, VA (ORF-Norfolk Intl.)");
    	goingInput.sendKeys(Keys.ENTER);
    	//depClick.click();
    	
	} 
    
    public void Search() throws InterruptedException {
		searchButton.click();
		/*Thread.sleep(6000);
		driver.switchTo().frame(2);
		verify.click();*/
	}
    public void Virginia() {
		virginia.click();
	}
   public void  DepClick() {
		depClick.click();
		
	} 
   public void  Departing() {
		departing.click();
	} 
   public void  RetClick() {
		 retClick.click();	
		} 
	
	 public void  Returning() {
		 returning.click();	
		} 
    
	 public void  DoneButton() {
		 Donebutton.click();	
			
		} 
	 

      public void  FlightTrip() {
    	  flightTrip.click();
			
		} 
      @FindBy( xpath="(//button[text()='Select'])[1]") WebElement slectButton;
      public void  SelectButton() {
    	  slectButton.click();
			
		} 
      @FindBy(xpath="(//*[@data-stid='select-link'])[1]")WebElement firstTrip;
      public void  FirstTrip() {
    	  firstTrip.click();
			
		} 
      
      @FindBy(xpath="(//*[@data-stid='location-field-leg1-origin-result-item-button'])[1]")WebElement airportName;
      public void  AirportName() {
    	  airportName.click();
			
		} 
      @FindBy(xpath="Roundtrip")WebElement textRoundTrip;
      public String RoundOfText() {
  		String textRoundTrips=textRoundTrip.getText();
  		return textRoundTrips;
  	}
}
