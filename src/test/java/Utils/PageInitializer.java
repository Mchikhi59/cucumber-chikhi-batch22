package Utils;

import pages.AddEmployeePage;
import pages.loginPage;

public class PageInitializer extends CommonMethods {

    public static loginPage loginPage;

    public static AddEmployeePage addEmployeePage;



    public static void initializePageObjects(){
        loginPage = new loginPage();
        addEmployeePage  = new AddEmployeePage();

    }


}
