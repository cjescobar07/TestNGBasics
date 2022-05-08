package TESTNG_class01;

import org.testng.annotations.Test;

public class DependsOn {

    @Test
    public void login(){
        System.out.println(10/0);
    }

    @Test(dependsOnMethods = "login")
    public void verificationOfDashBoard(){
        System.out.println("dashboard");
    }

}
