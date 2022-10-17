package testng;

import org.testng.annotations.Test;

public class Example7ParallelTestsFromSuite {


    @Test
    public void testA() throws InterruptedException {

        System.out.println("\nThis is first test!");

        Thread.sleep(5000L);

    }

    @Test
    public void testB() throws InterruptedException {

        System.out.println("\nThis is second test!");

        Thread.sleep(5000L);
    }

    @Test
    public void testC() throws InterruptedException {

        System.out.println("\nThis is third test!");

        Thread.sleep(5000L);
    }


    @Test
    public void testD() throws InterruptedException {

        System.out.println("\nThis is fourth test!");

        Thread.sleep(5000L);
    }

}
