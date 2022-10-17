package testng;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;
// Listeners are listening to events that they expect to happen
// They are defined in separated class
// They are specified in test class with @Listeners annotation and by providing the name of the class where are they placed
@Listeners( CustomListener.class )
public class Example8AListeners {

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
