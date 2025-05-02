package steps;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hooks extends CommonMethods {
    @Before
    public void start(){
       openBrowserAndLaunchApplication();

    }

    @After
    public void end(Scenario scenario){

        byte[] pic ;
        if (scenario.isFailed()){
            pic =takeScreenshot("failed/"+scenario.getName());
        }else {
            pic =takeScreenshot("passed/"+scenario.getName());
        }
        scenario.attach(pic,"image/png",scenario.getName());

       closeBrowser();


    }
}
