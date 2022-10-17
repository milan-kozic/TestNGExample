package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example3ADataProvider extends HelperClass {

    @Test
    public void testAddTwoPositiveNumbers(){


        System.out.println("\nSum of given numbers is: " + addTwoNumbers(10, 18) + "\n");

        System.out.println("****************************************************");
    }

    @Test
    public void AddTwoNegativeNumbers(){


        System.out.println("\nSum of given numbers is: " + addTwoNumbers(-10, -18) + "\n");

        System.out.println("****************************************************");
    }

    @Test
    public void testAddPositiveAndNegativeNumber(){


        System.out.println("\nSum of given numbers is: " + addTwoNumbers(10, -18) + "\n");

        System.out.println("****************************************************");
    }


    // DataProvider must have matching number of parameters of the matching data type
    // @Test( dataProvider = "inputValues")
    public void testAddTwoNumbers(int number1, int number2) {

        System.out.println("\nSum of given numbers is: " + addTwoNumbers(number1, number2) + "\n");

        System.out.println("****************************************************");
    }

    // @Test( dataProvider = "inputValues")
    public void unsuccessfulTest(int number1){

        System.out.println("\nSum of given numbers is: " + addTwoNumbers(number1, 35) + "\n");

        System.out.println("****************************************************");
    }


    // DataProvider is always two-dimensional array of Objects of matching type
    // Commonly, DataProviders are not placed in the same class with tests. They are usually placed in separate class, and they can be used in different test classes.
    @DataProvider
    private Object[][] inputValues(){

        return new Object[][] {
                {1, -2} ,
                {56, 0} ,
                {45, -87} ,
                {999, 666}
        };
    }
}
