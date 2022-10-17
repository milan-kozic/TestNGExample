package testng;

import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class Example1CTestDependsOnMethods {

    @Test
    public void testA(){

        System.out.println("\nThis is first test!");

    }

    // If the test on which this test depends fails, this test will not be executed
    @Test(dependsOnMethods = "testC")
    public void testB(){

        System.out.println("\nThis is second test!");
    }

    @Test
    public void testC(){

        System.out.println("\nThis is third test!");

        //fail("Third test failed!");
    }

}
