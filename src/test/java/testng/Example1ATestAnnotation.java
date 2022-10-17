package testng;

import org.testng.annotations.Test;

// Tests that have the same priority are executed in alphabetical order
public class Example1ATestAnnotation {

   @Test //( description = "This is the description of the first test", enabled = false )
    public void firstTest(){

        System.out.println("\nStart of the first test!");

        System.out.println("End of the first test!\n");
    }


    @Test //(invocationCount = 5)
    public void secondText(){

        System.out.println("\nStart of the second test!");

        System.out.println("End of the second test!\n");
    }


    @Test
    public void thirdTest(){

        System.out.println("\nStart of the third test!");

        System.out.println("End of the third test!\n");
    }
}
