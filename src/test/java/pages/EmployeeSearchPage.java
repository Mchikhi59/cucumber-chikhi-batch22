package pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeSearchPage extends CommonMethods {

    @FindBy(xpath="//*[@id='empsearch_id']")
    public WebElement empIdSearchField;

    @FindBy(xpath="//*[@id='empsearch_employee_name_empName']")
    public WebElement empNameSearchField;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id='menu_pim_viewEmployeeList']")
    public WebElement empListOption;

    public EmployeeSearchPage(){
        PageFactory.initElements(driver ,this);
    }
}
