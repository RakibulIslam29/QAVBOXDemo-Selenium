package rakibul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void start() {
		
		String browserName = System.getProperty("browser", "chrome");
		
		if(browserName.contains("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(browserName.contains("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
	}
}
	@AfterSuite
	public void close() {
		
		driver.close();
	}

}