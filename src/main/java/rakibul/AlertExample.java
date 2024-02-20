package rakibul;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertExample extends BaseDriver{

	public String url = "https://the-internet.herokuapp.com/javascript_alerts";
	
	@Test
	public void alertTest() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement jsAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
		WebElement jsPromot = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		
		jsAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		jsConfirm.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		jsPromot.click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Rakibul islam"); // Enter text into the prompt
        promptAlert.accept();
        Thread.sleep(2000);
	}
	

}
