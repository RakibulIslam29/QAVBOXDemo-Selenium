package rakibul;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class WindowOrTabHandling extends BaseDriver {

    public String url1 = "https://the-internet.herokuapp.com/javascript_alerts";
    public String url2 = "https://testguild.com/";

    @Test
    public void tabWindowTest() throws InterruptedException {

        driver.get(url1);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Open a new tab
        driver.switchTo().newWindow(WindowType.TAB);

        // Switch to the new tab and navigate to url2
        driver.get(url2);
        
        // Get the window handles and switch back to the first tab
        List<String> windowHandles = windowHandling();
        driver.switchTo().window(windowHandles.get(0)); // switching TAB
        Thread.sleep(2000);
        driver.switchTo().window(windowHandles.get(1));
    }

    public List<String> windowHandling() {

        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> windowHandlesList = new ArrayList<String>(windowHandles);
        int size = windowHandlesList.size();
        System.out.println("Window/Tab Numbers: " + size);
        return windowHandlesList;
    }

    @AfterSuite
    public void close() {
        driver.quit();
    }
}
