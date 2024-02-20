package rakibul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigationHandling extends BaseDriver{
	
	public String url = "https://qavbox.github.io/demo/signup/" ;
	
	@Test
	public void dropDownTest() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Username Input Field
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='username']"));
		FirstName.sendKeys("Md. Rakibul Islam");
		
		//Email Input Field
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("rakib@gmail.com");
		
		// navigate
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.navigate().to("https://demoqa.com/text-box");
		Thread.sleep(3000);
		
	};
};
