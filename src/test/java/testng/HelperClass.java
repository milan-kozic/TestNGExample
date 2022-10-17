package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class HelperClass {

    static final String USERNAME = "username";
    static final String PASSWORD = "qwerty";


    @BeforeClass
    public void executeBeforeClass2(){

        System.out.println("\nThis is @BeforeClass of inherited class.");
    }


    @AfterClass
    public void executeAfterClass2(){

        System.out.println("\nThis is @AfterClass of inherited class.");
    }


    int addTwoNumbers(int firstNumber, int secondNumber){

        return secondNumber + firstNumber;

    }


}
