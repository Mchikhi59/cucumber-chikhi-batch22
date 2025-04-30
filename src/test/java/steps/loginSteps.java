package steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.loginPage;
import static Utils.PageInitializer.loginPage;

public class loginSteps extends CommonMethods {


    //loginPage loginPage =new loginPage();
    /*public WebDriver driver;*/
    @Given("user is able to access to HRMS application")
    public void user_is_able_to_access_to_hrms_application() {
        openBrowserAndLaunchApplication();
    }
    @When("usr enters a valid username and password")
    public void usr_enters_a_valid_username_and_password() {
        //WebElement usernameField =driver.findElement(By.id("txtUsername"));
        //usernamefield.sendKeys("Admin");
        sendText(ConfigReader.read("userName"), loginPage.usernameField);

        //WebElement passwordField = driver.findElement(By.id("txtPassword"));
        //passwordfield.sendKeys("Hum@nhrm123");
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }
    @When("user click on valid button")
    public void user_click_on_valid_button() {
        //WebElement loginButton =driver.findElement(By.id("btnLogin"));
        //validbutton.click();
        click(loginPage.loginButton);
    }
    @Then("user able to see dashboard page")
    public void user_able_to_see_dashboard_page() {
        System.out.println("test passed");
    }

    @When("user click on PIM pption")
    public void user_click_on_pim_pption() {
       // WebElement pimoption =driver.findElement(By.id("menu_pim_viewPimModule"));
        //pimoption.click();
        click(loginPage.pimoption);
    }


    }





