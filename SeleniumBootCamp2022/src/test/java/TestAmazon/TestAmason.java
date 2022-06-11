package TestAmazon;

import java.io.IOException;

import org.testng.annotations.Test;

import Amazon.AHomepage;
import M.common.Utility;

public class TestAmason extends Utility{
  @Test
  public void f() throws InterruptedException, IOException {
	  AHomepage am =new AHomepage(driver);
	  am.Search();
	  Thread.sleep(6000);
	  Pictures();
	  am.SearchButton();
	  Thread.sleep(6000);
	  Pictures();
	  am.Productpage();
	  Thread.sleep(6000);
	  Pictures();
	  am.AddToCart();
	  Thread.sleep(6000);
	  Pictures();
  }
}
