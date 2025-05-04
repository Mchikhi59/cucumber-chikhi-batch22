package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimoption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement addEmpoption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement empListOption;

    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }

}
