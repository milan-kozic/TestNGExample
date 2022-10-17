package testng;

import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class Example1BTestPriority {


    @Test( priority = 3 )
    public void testA(){

        System.out.println("\nThis is first test!");

    }

    @Test( priority = 1 )
    public void testB(){

        System.out.println("\nThis is second test!");
    }

    @Test( priority = 2 )
    public void testC(){

        System.out.println("\nThis is third test!");

       // fail("Third test failed!");
    }

    // priority = 0 is default value
    @Test
    public void testD(){

        System.out.println("\nThis is fourth test!");

    }
}
