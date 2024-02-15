package rakibul;

import java.util.List;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeHandling extends BaseDriver{
	
	public String url = "https://www.selenium.dev/selenium/docs/api/java/index.html";
	@Test
	public void iframeTest() throws InterruptedException {
	
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> iframeNumber = driver.findElements(By.tagName("iframe"));
		
		System.out.println(iframeNumber.size());
		driver.switchTo().frame("classFrame");
		WebElement tree = driver.findElement(By.xpath("//header[@role=\"banner\"]/nav/div[1]/div[1]/ul/li[5]/a"));
		tree.click();
		
		Thread.sleep(5000);
		
	}



}
