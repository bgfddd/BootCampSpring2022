package TestExpedia;

import java.io.IOException;


import org.testng.annotations.Test;

import Expedia.ExpidiaPage;
import M.common.Utility;

public class TestExpediaPage extends Utility{
  @Test
  public void f()  throws InterruptedException, IOException{
	  
	  ExpidiaPage Exp =new ExpidiaPage(driver);
	  Exp.Flights();
	  Thread.sleep(6000);
	  Exp.Leaving();
	  Thread.sleep(6000);
	  Exp.Going();
	  Thread.sleep(6000);
	  /*Exp.DoneButton();
	  Thread.sleep(6000);*/
	  
  }
}
