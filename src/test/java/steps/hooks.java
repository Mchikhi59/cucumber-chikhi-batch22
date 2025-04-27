package steps;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hooks extends CommonMethods {
    @Before
    public void start(){
       openBrowserAndLaunchApplication();

    }

    @After
    public void end(){
       closeBrowser();

    }
}
