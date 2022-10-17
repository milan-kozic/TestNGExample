package testng;

import org.testng.annotations.*;

public class Example2ABeforeAfterAnnotations extends HelperClass {
// BeforeClass method from the inherited class will be executed before BeforeClass method of this class
// AfterClass method from the inherited class will be executed after AfterClass method of this class

    @BeforeClass
    public void executeBeforeClass(){

        System.out.println("\nThis is @BeforeClass.");

    }

    @BeforeMethod
    public void executeBeforeTestMethod(){

        System.out.println("\n*************************************************\n");

        System.out.println("This is @BeforeMethod.");
    }

    @AfterMethod
    public void executeAfterTestMethod(){

        System.out.println("\nThis is @AfterMethod.");

        System.out.println("\n*************************************************");
    }

    @AfterClass
    public void executeAfterClass(){

        System.out.println("\nThis is @AfterClass.");
    }

    @Test
    public void firstTest(){

        System.out.println("\nStart of first test!");

        System.out.println("End of first test!\n");
    }


    @Test
    public void secondTest(){

        System.out.println("\nStart of second test!");

        System.out.println("End of second test!\n");

    }

    @Test
    public void thirdTest(){

        System.out.println("\nStart of third test!");

        System.out.println("End of third test!\n");

    }

}
