package steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class loginSteps extends CommonMethods {


    /*public WebDriver driver;*/
    @Given("user is able to access to HRMS application")
    public void user_is_able_to_access_to_hrms_application() {
        openBrowserAndLaunchApplication();
    }
    @When("usr enters a valid username and password")
    public void usr_enters_a_valid_username_and_password() {
        WebElement usernamefield=driver.findElement(By.id("txtUsername"));
        //usernamefield.sendKeys("Admin");
        sendText(ConfigReader.read("userName"),usernamefield);
        WebElement passwordfield= driver.findElement(By.id("txtPassword"));
        //passwordfield.sendKeys("Hum@nhrm123");
        sendText(ConfigReader.read("password"),passwordfield);
    }
    @When("user click on valid button")
    public void user_click_on_valid_button() {
        WebElement validbutton=driver.findElement(By.id("btnLogin"));
        //validbutton.click();
        click(validbutton);
    }
    @Then("user able to see dashboard page")
    public void user_able_to_see_dashboard_page() {
        System.out.println("test passed");
    }

    @When("user click on PIM pption")
    public void user_click_on_pim_pption() {
        WebElement pimoption =driver.findElement(By.id("menu_pim_viewPimModule"));
        //pimoption.click();
        click(pimoption);
    }


    }





