package testng;

import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class Example9ARetryCount {


    @Test ( retryAnalyzer = RepeatTests.class )
    public void testA(){

        System.out.println("\nThis is first test!");
    }

    @Test ( retryAnalyzer = RepeatTests.class )
    public void testB() {

        System.out.println("\nThis is second test!");

    }

    @Test ( retryAnalyzer = RepeatTests.class )
    public void testC(){

        System.out.println("\nThis is third test!");

        fail();
    }
}
