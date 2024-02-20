package rakibul;

import org.testng.annotations.Test;

public class ScrollHandling extends BaseDriver{

	  public String url = "https://testguild.com/";

	    @Test
	    public void tabWindowTest() throws InterruptedException {

	        driver.get(url);
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	    }
}
