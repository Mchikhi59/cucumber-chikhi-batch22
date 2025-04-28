package steps;

import Utils.CommonMethods;
import Utils.Excelreader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    @When("use clicks on add employee option")
    public void use_clicks_on_add_employee_option() {
        WebElement addEmpoption =driver.findElement(By.id("menu_pim_addEmployee"));
        //addEmpoption.click();
        click(addEmpoption);

    }
    @When("user enter firstname and lastname")
    public void user_enter_firstname_and_lastname() {
        WebElement firstname =driver.findElement(By.id("firstName"));
        WebElement lastname =driver.findElement(By.id("lastName"));
        sendText("miloud",firstname);
        sendText("chikhi",lastname);
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
        //firstname.sendKeys("miloud");
        sendText("miloud",firstname);
        //middleName.sendKeys("mc");
        sendText("mc",middleName);
        //lastname.sendKeys("chikhi");
        sendText("chikhi",lastname);

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
        //firstnameLocator.sendKeys(firstname);
        sendText("firstname",firstnameLocator);
       // middleNameLocator.sendKeys(middleName);
        sendText("middlename",middleNameLocator);
        //lastnameLocator.sendKeys(lastname);
        sendText("lastname",lastnameLocator);
    }
    @When("user add {string} , {string} and {string}")
    public void user_add_and(String fn, String mn, String ln) {
        WebElement firstnameLocator =driver.findElement(By.id("firstName"));
        WebElement middleNameLocator =driver.findElement(By.id("middleName"));
        WebElement lastnameLocator =driver.findElement(By.id("lastName"));
        //firstnameLocator.sendKeys(fn);
        sendText("fn",firstnameLocator);
        //middleNameLocator.sendKeys(mn);
        sendText("mn",middleNameLocator);
        //lastnameLocator.sendKeys(ln);
        sendText("ln",lastnameLocator);
    }

    @When("user add a multiple employees using data table and save")
    public void user_add_a_multiple_employees_using_data_table_and_save(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> employeenames= dataTable.asMaps();

        for (Map<String,String>employee:employeenames){

            WebElement firstnameLocator =driver.findElement(By.id("firstName"));
            WebElement lastnameLocator =driver.findElement(By.id("lastName"));
            WebElement middleNameLocator =driver.findElement(By.id("middleName"));
            //firstnameLocator.sendKeys(employee.get("firstname"));
            sendText(employee.get("firstname"),firstnameLocator);
            //middleNameLocator.sendKeys(employee.get("middlename"));
            sendText(employee.get("middlename"),middleNameLocator);
            //lastnameLocator.sendKeys(employee.get("lastname"));
            sendText(employee.get("lastname"),lastnameLocator);

            WebElement savebutton =driver.findElement(By.id("btnSave"));
            click(savebutton);

            WebElement addEmpoption =driver.findElement(By.id("menu_pim_addEmployee"));
            click(addEmpoption);
        }
    }

    @When("user adds multiple employees from excel file")
    public void user_adds_multiple_employees_from_excel_file() throws IOException {
        List<Map<String,String>> newEmployees = Excelreader.read();
        for (Map<String,String> employee:newEmployees){

            WebElement firstNameLocator=driver.findElement(By.id("firstName"));
            WebElement middleNameLocator=driver.findElement(By.id("middleName"));
            WebElement lastNameLocator=driver.findElement(By.id("lastName"));

            //firstNameLocator.sendKeys(employee.get("firstName"));
            sendText(employee.get("firstName"),firstNameLocator);
            //middleNameLocator.sendKeys(employee.get("middleName"));
            sendText(employee.get("middleName"),middleNameLocator);
            //lastNameLocator.sendKeys(employee.get("lastName"));
            sendText(employee.get("lastName"),lastNameLocator);

            WebElement saveButton =driver.findElement(By.id("btnSave"));
            click(saveButton);

            WebElement addEmpoption =driver.findElement(By.id("menu_pim_addEmployee"));
            click(addEmpoption);

        }
    }
}
