package steps;

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

public class loginSteps extends baseclass{


    /*public WebDriver driver;*/
    @Given("user is able to access to HRMS application")
    public void user_is_able_to_access_to_hrms_application() {
         driver = new ChromeDriver();
        //Global wait implicitwait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }
    @When("usr enters a valid username and password")
    public void usr_enters_a_valid_username_and_password() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
    }
    @When("user click on valid button")
    public void user_click_on_valid_button() {
        driver.findElement(By.id("btnLogin")).click();
    }
    @Then("user able to see dashboard page")
    public void user_able_to_see_dashboard_page() {
        System.out.println("test passed");
    }

    @When("user click on PIM pption")
    public void user_click_on_pim_pption() {
        WebElement pimoption =driver.findElement(By.id("menu_pim_viewPimModule"));
        pimoption.click();
    }
    @When("use clicks on add employee option")
    public void use_clicks_on_add_employee_option() {
        WebElement addEmpoption =driver.findElement(By.id("menu_pim_addEmployee"));
        addEmpoption.click();

    }
    @When("user enter firstname and lastname")
    public void user_enter_firstname_and_lastname() {
        WebElement firstname =driver.findElement(By.id("firstName"));
        WebElement lastname =driver.findElement(By.id("lastName"));
        firstname.sendKeys("miloud");
        lastname.sendKeys("chikhi");
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        WebElement savebutton =driver.findElement(By.id("btnSave"));
        savebutton.click();


    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("employee will add later");

    }
    @When("user enter username middlename and lastname")
    public void user_enter_username_middlename_and_lastname() {
        WebElement firstname =driver.findElement(By.id("firstName"));
        WebElement lastname =driver.findElement(By.id("lastName"));
        WebElement middleName =driver.findElement(By.id("middleName"));
        firstname.sendKeys("miloud");
        middleName.sendKeys("mc");
        lastname.sendKeys("chikhi");


    }

    @When("usr enters a invalid username and password")
    public void usr_enters_a_invalid_username_and_password() {
        System.out.println("employee will add later");
    }
    @Then("user can see error message")
    public void user_can_see_error_message() {
        System.out.println("employee will add later");
    }

    @When("user enter {string} and {string} and {string} in the application")
    public void user_enter_and_and_in_the_application(String firstname, String middleName, String lastname) {
        WebElement firstnameLocator =driver.findElement(By.id("firstName"));
        WebElement lastnameLocator =driver.findElement(By.id("lastName"));
        WebElement middleNameLocator =driver.findElement(By.id("middleName"));
        firstnameLocator.sendKeys(firstname);
        middleNameLocator.sendKeys(middleName);
        lastnameLocator.sendKeys(lastname);
    }
    @When("user add {string} , {string} and {string}")
    public void user_add_and(String fn, String mn, String ln) {
        WebElement firstnameLocator =driver.findElement(By.id("firstName"));
        WebElement middleNameLocator =driver.findElement(By.id("middleName"));
        WebElement lastnameLocator =driver.findElement(By.id("lastName"));
        firstnameLocator.sendKeys(fn);
        middleNameLocator.sendKeys(mn);
        lastnameLocator.sendKeys(ln);
    }

    @When("user add a multiple employees using data table and save")
    public void user_add_a_multiple_employees_using_data_table_and_save(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> employeenames= dataTable.asMaps();

        for (Map<String,String>employee:employeenames){

            WebElement firstnameLocator =driver.findElement(By.id("firstName"));
            WebElement lastnameLocator =driver.findElement(By.id("lastName"));
            WebElement middleNameLocator =driver.findElement(By.id("middleName"));
            firstnameLocator.sendKeys(employee.get("firstname"));
            middleNameLocator.sendKeys(employee.get("middlename"));
            lastnameLocator.sendKeys(employee.get("lastname"));

            WebElement savebutton =driver.findElement(By.id("btnSave"));
            savebutton.click();

            WebElement addEmpoption =driver.findElement(By.id("menu_pim_addEmployee"));
            addEmpoption.click();
        }
    }

    @When("user adds multiple employees from excel file")
    public void user_adds_multiple_employees_from_excel_file() throws IOException {
        List<Map<String,String>> newEmployees = Excelreader.read();
        for (Map<String,String> employee:newEmployees){

            WebElement firstNameLocator=driver.findElement(By.id("firstName"));
            WebElement middleNameLocator=driver.findElement(By.id("middleName"));
            WebElement lastNameLocator=driver.findElement(By.id("lastName"));

            firstNameLocator.sendKeys(employee.get("firstName"));
            middleNameLocator.sendKeys(employee.get("middleName"));
            lastNameLocator.sendKeys(employee.get("lastName"));

            WebElement saveButton =driver.findElement(By.id("btnSave"));
            saveButton.click();

            WebElement addEmpoption =driver.findElement(By.id("menu_pim_addEmployee"));
            addEmpoption.click();

        }
    }

    }





