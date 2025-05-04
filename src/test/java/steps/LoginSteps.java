package steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginSteps extends CommonMethods {


    /*public WebDriver driver;*/
    @Given("user is able to access to HRMS application")
    public void user_is_able_to_access_to_hrms_application() {
        openBrowserAndLaunchApplication();
    }
    @When("usr enters a valid username and password")
    public void usr_enters_a_valid_username_and_password() {
        //WebElement usernamefield=driver.findElement(By.id("txtUsername"));
        //usernamefield.sendKeys("Admin");
        sendText(ConfigReader.read("userName"),loginPage.usernameField);
        //WebElement passwordfield= driver.findElement(By.id("txtPassword"));
        //passwordfield.sendKeys("Hum@nhrm123");
        sendText(ConfigReader.read("password"),loginPage.passwordField);
    }
    @When("user click on valid button")
    public void user_click_on_valid_button() {
       // WebElement loginButton=driver.findElement(By.id("btnLogin"));
        //validbutton.click();
        click(loginPage.loginButton);
    }
    @Then("user able to see dashboard page")
    public void user_able_to_see_dashboard_page() {
        System.out.println("test passed");
    }
    @When("usr enters a invalid username and password")
    public void usr_enters_a_invalid_username_and_password() {
        sendText("admin321", loginPage.usernameField);
        sendText("ghsnertuldnf", loginPage.passwordField);
    }
    @Then("user can see error message")
    public void user_can_see_error_message() {
        //assertions - comparing the values
        String errorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(errorMessage, "Invalid credentials");
        System.out.println("error is shown");


        //assertions - checking the existence of  the field
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
    }



    }





