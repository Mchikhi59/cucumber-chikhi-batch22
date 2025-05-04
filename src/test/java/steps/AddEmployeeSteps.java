package steps;

import Utils.CommonMethods;
import Utils.Excelreader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AddEmployeePage;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static Utils.PageInitializer.addEmployeePage;

public class AddEmployeeSteps extends CommonMethods {


    //AddEmployeePage addEmployeePage=new AddEmployeePage();

   @When("user click on PIM pption")
    public void user_click_on_pim_pption() {
        //WebElement pimoption =driver.findElement(By.id("menu_pim_viewPimModule"));
        //pimoption.click();
        click(dashboardPage.pimoption);
    }

    @When("use clicks on add employee option")
    public void use_clicks_on_add_employee_option() {
        WebElement addEmpoption =driver.findElement(By.id("menu_pim_addEmployee"));
        //addEmpoption.click();
        click(dashboardPage.addEmpoption);

    }
    @When("user enter firstname and lastname")
    public void user_enter_firstname_and_lastname() {
       /* WebElement firstNameLocator =driver.findElement(By.id("firstName"));
        WebElement lastNameLocator =driver.findElement(By.id("lastName"));*/
        sendText("miloud",addEmployeePage.firstNameLocator);
        sendText("chikhi",addEmployeePage.lastNameLocator);
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
       // WebElement savebutton =driver.findElement(By.id("btnSave"));
        click(addEmployeePage.savebutton);


    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("employee will add later");

    }
    @When("user enter username middlename and lastname")
    public void user_enter_username_middlename_and_lastname() {
       /* WebElement firstNameLocator =driver.findElement(By.id("firstName"));
        WebElement lastNameLocator =driver.findElement(By.id("lastName"));
        WebElement middleNameLocator =driver.findElement(By.id("middleName"));*/
        //firstname.sendKeys("miloud");
        sendText("miloud", addEmployeePage.firstNameLocator);
        //middleName.sendKeys("mc");
        sendText("mc",addEmployeePage.middleNameLocator);
        //lastname.sendKeys("chikhi");
        sendText("chikhi",addEmployeePage.lastNameLocator);

    }



    @When("user enter {string} and {string} and {string} in the application")
    public void user_enter_and_and_in_the_application(String firstname, String middlename, String lastname) {
       /* WebElement firstNameLocator =driver.findElement(By.id("firstName"));
        WebElement lastNameLocator =driver.findElement(By.id("lastName"));
        WebElement middleNameLocator =driver.findElement(By.id("middleName"));*/
        //firstnameLocator.sendKeys(firstname);
        sendText("firstname", addEmployeePage.firstNameLocator);
       // middleNameLocator.sendKeys(middleName);
        sendText("middlename",addEmployeePage.middleNameLocator);
        //lastnameLocator.sendKeys(lastname);
        sendText("lastname", addEmployeePage.lastNameLocator);
    }
    @When("user add {string} , {string} and {string}")
    public void user_add_and(String fn, String mn, String ln) {
       /* WebElement firstNameLocator =driver.findElement(By.id("firstName"));
        WebElement middleNameLocator =driver.findElement(By.id("middleName"));
        WebElement lastNameLocator =driver.findElement(By.id("lastName"));*/
        //firstnameLocator.sendKeys(fn);
        sendText("fn", addEmployeePage.firstNameLocator);
        //middleNameLocator.sendKeys(mn);
        sendText("mn",addEmployeePage.middleNameLocator);
        //lastnameLocator.sendKeys(ln);
        sendText("ln",addEmployeePage.lastNameLocator);
    }

    @When("user add a multiple employees using data table and save")
    public void user_add_a_multiple_employees_using_data_table_and_save(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> employeenames= dataTable.asMaps();

        for (Map<String,String>employee:employeenames){

            /*WebElement firstNameLocator =driver.findElement(By.id("firstName"));
            WebElement lastNameLocator =driver.findElement(By.id("lastName"));
            WebElement middleNameLocator =driver.findElement(By.id("middleName"));*/
            //firstnameLocator.sendKeys(employee.get("firstname"));
            sendText(employee.get("firstname"), addEmployeePage.firstNameLocator);
            //middleNameLocator.sendKeys(employee.get("middlename"));
            sendText(employee.get("middlename"),addEmployeePage.middleNameLocator);
            //lastnameLocator.sendKeys(employee.get("lastname"));
            sendText(employee.get("lastname"),addEmployeePage.lastNameLocator);

            //WebElement savebutton =driver.findElement(By.id("btnSave"));
            click(addEmployeePage.savebutton);

            WebElement addEmpoption =driver.findElement(By.id("menu_pim_addEmployee"));
            click(dashboardPage.addEmpoption);
        }
    }

    @When("user adds multiple employees from excel file")
    public void user_adds_multiple_employees_from_excel_file() throws IOException {
        List<Map<String,String>> newEmployees = Excelreader.read();
        for (Map<String,String> employee:newEmployees){

            /*WebElement firstNameLocator=driver.findElement(By.id("firstName"));
            WebElement middleNameLocator=driver.findElement(By.id("middleName"));
            WebElement lastNameLocator=driver.findElement(By.id("lastName"));*/

            //firstNameLocator.sendKeys(employee.get("firstName"));
            sendText(employee.get("firstName"),addEmployeePage.firstNameLocator);
            //middleNameLocator.sendKeys(employee.get("middleName"));
            sendText(employee.get("middleName"),addEmployeePage.middleNameLocator);
            //lastNameLocator.sendKeys(employee.get("lastName"));
            sendText(employee.get("lastName"),addEmployeePage.lastNameLocator);

            WebElement savebutton =driver.findElement(By.id("btnSave"));
            click(addEmployeePage.savebutton);


            WebElement addEmpoption =driver.findElement(By.id("menu_pim_addEmployee"));
            click(dashboardPage.addEmpoption);

        }
    }
}
