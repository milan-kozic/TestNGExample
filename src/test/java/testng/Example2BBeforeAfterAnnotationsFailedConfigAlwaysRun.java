package testng;

import org.testng.annotations.*;

import static org.testng.Assert.fail;

public class Example2BBeforeAfterAnnotationsFailedConfigAlwaysRun {

    // If this method fails, any other method after this one will not be executed
    @BeforeClass
    public void executeBeforeClass(){

        System.out.println("\nThis is @BeforeClass.");

        fail("Help, no test will be executed!");
    }

    @BeforeMethod
    public void executeBeforeMethod(){

        System.out.println("\n*************************************************\n");

        System.out.println("This is @BeforeMethod.");
    }

    @AfterMethod
    public void executeAfterMethod(){

        System.out.println("\nThis is @AfterMethod.");

        System.out.println("\n*************************************************");
    }

    @AfterClass//( alwaysRun = true )
    public void executeAfterClass(){

        System.out.println("\nRun @AfterClass anyway.");
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
