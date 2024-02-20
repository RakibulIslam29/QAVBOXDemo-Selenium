package rakibul;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardHandling extends BaseDriver{

	public String url = "https://demoqa.com/text-box";
	
	@Test
	public void Keyboardtest() throws InterruptedException{
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		WebElement CurrentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement PermanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		CurrentAddress.sendKeys("Mirpur-2, Dhaka-1216, bangladesh");
		
		// Select All
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		// Copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		// Tab
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		// Paste
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
//		// Enter 
//		action.sendKeys(Keys.ENTER);
//		action.build().perform();
	}
}
