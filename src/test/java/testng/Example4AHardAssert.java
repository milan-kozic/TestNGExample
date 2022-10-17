package testng;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Example4AHardAssert extends HelperClass {

    private boolean correctCredentials = false;

    @Test( dataProviderClass = DataProviders.class, dataProvider = "credentials" )
    public void testAreCredentialsCorrect(String username, String password){


        System.out.println("\nUsername - " + username);

        assertEquals(username, USERNAME, "Wrong Username!");


        System.out.println("\nPassword - " + password);

        assertEquals(password, PASSWORD, "Wrong Password!");


        System.out.println("\nCredentials are correct!");
    }


    @Test( dataProviderClass = DataProviders.class, dataProvider = "credentials" )
    public void testIsUserSuccessfullyLoggedIn(String username, String password){

        System.out.println("\nUsername - " + username);
        System.out.println("\nPassword - " + password);

        if (username.equals(USERNAME) && password.equals(PASSWORD)){

            correctCredentials = true;
        }

        assertTrue(correctCredentials, "\nUnsuccessful login. Check credentials!");

        System.out.println("\nUser is successfully logged in.");

    }

}
