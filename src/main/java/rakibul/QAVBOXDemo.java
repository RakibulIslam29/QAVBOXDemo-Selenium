package rakibul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class QAVBOXDemo extends BaseDriver {

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
		
		// TelePhone Input Field
		WebElement Telephone = driver.findElement(By.xpath("//input[@id='tel']"));
		Telephone.sendKeys("01705139222");

		//Fax No ()
//		WebElement FaxNo = driver.findElement(By.xpath("//input[@id='fax']"));
//		FaxNo.sendKeys("1112223333"); // Input field is found blocked thats why i take it comments
		
		// File Upload
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Lenovo\\Desktop\\Rakib\\Rakibul Islam.pdf");
		
		
		// Select DropDown (Gender)
		WebElement gender = driver.findElement(By.xpath("//select[@name='sgender']"));
		
		Select Myselect = new Select(gender);
		Myselect.selectByVisibleText("Female");
		
		// Experience Input
		WebElement experience = driver.findElement(By.xpath("//input[@value='two']"));
        experience.sendKeys(" ");
        
        // CheckBox field
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value= 'manualtesting']"));
        checkbox1.click();
        
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@value= 'automationtesting']"));
        checkbox2.click();
        
        WebElement checkbox3 = driver.findElement(By.xpath("//input[@value= 'testng']"));
        checkbox3.click();
        
        WebElement checkbox4 = driver.findElement(By.xpath("//input[@value= 'apitesting']"));
        checkbox4.click();
        
        WebElement checkbox5 = driver.findElement(By.xpath("//input[@value= 'html']"));
        checkbox5.click();

        WebElement checkbox6 = driver.findElement(By.xpath("//input[@value= 'java']"));
        checkbox6.click();
        
        WebElement checkbox7 = driver.findElement(By.xpath("//input[@value= 'c#']"));
        checkbox7.click();
        
        // Automation Tools
        WebElement automationSelect = driver.findElement(By.xpath("//option[@value='selenium']"));
        automationSelect.click();
         
        //Submit
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();
        
        //Close the browser
        driver.quit();
        
	}

}
