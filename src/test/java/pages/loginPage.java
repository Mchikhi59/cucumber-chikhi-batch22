package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.CommonMethods;

public class loginPage extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement usernameField;

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(id ="btnLogin")
    public WebElement loginButton;

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimoption;


    public loginPage(){
        //page factory we use to initialize all the web elements and driver we pass as
        // an argument to it. this keyword means, we need to initialize all the elements
        // of this local class
        PageFactory.initElements(driver,this);
    }

}
