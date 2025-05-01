package Utils;

import pages.AddEmployeePage;
import pages.EmployeeSearchPage;
import pages.LoginPage;

public class PageInitializer  {

    public static LoginPage loginPage;
    public static AddEmployeePage addEmployeePage;
    public static EmployeeSearchPage employeeSearchPage;




    public static void initializePageObjects(){
        loginPage = new LoginPage();
        addEmployeePage  = new AddEmployeePage();
        employeeSearchPage =new EmployeeSearchPage();


    }


}
