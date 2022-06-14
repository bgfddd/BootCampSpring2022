package TestExpedia;

import java.io.IOException;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Expedia.ExpidiaPage;
import M.common.Utility;

public class TestExpediaPage extends Utility{
  @Test
  public void f()  throws InterruptedException, IOException{
	  
	  ExpidiaPage Exp =new ExpidiaPage(driver);
	  Exp.Flights();
	  Thread.sleep(6000);
	  String  Flights=Exp.RoundOfText();
	  SoftAssert softit=new SoftAssert();
	  softit.assertEquals("Roundtrip",Flights );
	  System.out.println("This is after assertions");
	  softit.assertAll();
	  
	  
	  
	 
  }
  
  @Test
  public void flightPage()  throws InterruptedException, IOException{
	  
	  ExpidiaPage Exp =new ExpidiaPage(driver);
	  Exp.Flights();
	  Thread.sleep(6000);
	  Exp.Leaving();
	  Thread.sleep(6000);
	  Exp.Going();
	  Thread.sleep(6000);
	  Exp.DepClick();
	  Exp.Departing();
	  Exp.DoneButton();
	  Exp.RetClick();
	  Exp.Returning();
	  Exp.DoneButton();
	  Exp.Search();
	  Thread.sleep(6000);
	 
  }
}
