package TESTNG_class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginExample {
public static WebDriver driver;

// to login into syntax HRMS application with the following credentials
// userName: Admin
// password: 12345
    @Test
    public void invalidCredentials1(){

    }



// to login into syntax HRMS application with the following credentials
// userName: Admin
// password: 123456
    @Test
    public void invalidCredentials2(){

}

// precondition --> open the browser and navigate to the url
    @BeforeMethod
    public void OpenBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

    }


}
