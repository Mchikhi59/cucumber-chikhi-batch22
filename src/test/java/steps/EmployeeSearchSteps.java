package steps;

import Utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.EmployeeSearchPage;

public class EmployeeSearchSteps extends CommonMethods{
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        //WebElement searchButton = driver.findElement(By.id("searchBtn"));
        click(employeeSearchPage.searchButton);
    }


    @When("user clicks on employee list option")
    public void user_clicks_on_employee_list_option() {
        WebElement empListOption = driver.findElement(By.xpath("//*[@id='menu_pim_viewEmployeeList']"));
        click(empListOption);
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        //WebElement empIdSearchField = driver.findElement(By.xpath("//*[@id='empsearch_id']"));
       sendText("23878199",employeeSearchPage.empIdSearchField);
    }

    @Then("user is able to see employee details")
    public void user_is_able_to_see_employee_details() {
        System.out.println("test passed");
    }

    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
       // WebElement empNameSearchField = driver.findElement(By.xpath("//*[@id='empsearch_employee_name_empName']"));
        sendText("Rami",employeeSearchPage.empNameSearchField);
    }

}
