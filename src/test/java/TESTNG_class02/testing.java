package TESTNG_class02;

import org.testng.annotations.*;

public class testing {

@BeforeSuite
public void beforeSuite(){
    System.out.println("I am before the suite");
}

@AfterSuite
public void afterSuite(){
    System.out.println("I am after the suite");
}

@BeforeTest
public void beforeTest(){
    System.out.println("I am before the test");
}

@AfterTest
public void afterTest(){
    System.out.println("I am after the test");
}

@BeforeClass
public void beforeClass(){
    System.out.println("I am before the class method");
}

@AfterClass
public void afterClass(){
    System.out.println("I am after the class method");
}

@BeforeMethod
public void before(){
    System.out.println("this is my before method");
    }

@AfterMethod
public void after(){
    System.out.println("this is my after method");
    }

@Test
public void Test1(){
    System.out.println("hello world, hi world");
}

@Test
public void Test2(){
     System.out.println("testing 123, TESTING 1234");
    }

}
