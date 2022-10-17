package testng;

import org.testng.annotations.Test;

import static org.testng.Assert.fail;


// Listeners can be specified in the Suite, so there is no need to specify them in the test class
public class Example8BListeners {

    @Test
    public void testA(){

        System.out.println("\nThis is first test!");
    }

    @Test
    public void testB() throws InterruptedException {

        System.out.println("\nThis is second test!");

        Thread.sleep(5000L);

    }

    @Test
    public void testC(){

        System.out.println("\nThis is third test!");

        // This test will fail
        fail();

    }

    // This test depends on testC
    @Test ( dependsOnMethods = "testC" )
    public void testD(){

        System.out.println("\nThis is fourth test!");

    }
}
