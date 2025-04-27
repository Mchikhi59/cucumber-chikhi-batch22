package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hooks extends baseclass {
    @Before
    public void start(){
        driver = new ChromeDriver();
        //Global wait implicitwait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

    }

    @After
    public void end(){
        driver.quit();

    }
}
