package testng;

import org.testng.annotations.Test;

public class Example3BDataProviderFromClassAndParallel extends HelperClass {

    @Test( dataProviderClass = DataProviders.class, dataProvider = "anyTwoNumbers")
    public void testCalculateSum(int number1, int number2) throws InterruptedException {

        System.out.println("\nSum of given numbers is: " + addTwoNumbers(number1, number2) + "\n");

        // Slowing down tests, so we can see that tests are executed in parallel
        Thread.sleep(5000L);

        System.out.println("****************************************************");
    }



}
