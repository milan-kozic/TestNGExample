package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

// Tests that use Parameters cannot use DataProvider and vice versa
public class Example5AParametersAnnotation extends HelperClass {


    // Annotation @Parameters must be placed above annotation @Test
    // Names of parameters are listed here, and values of parameters are listed in Suite file
    @Parameters ( {"userUsername", "userPassword"} )
    @Test
    public void testCheckCredentials1(String name, String pass){

        areCredentialsCorrect(name, pass);
    }


    // For any of the parameter, default value can be defined
    @Parameters ({"userUsername", "userPassword"})
    @Test
    public void testCheckCredentials2(@Optional("Igi Pop") String name, String pass){

        areCredentialsCorrect(name, pass);
    }


    private void areCredentialsCorrect(String username, String password) {


        System.out.println("\nUsername - " + username);

        assertEquals(username, USERNAME, "Username is not correct!");


        System.out.println("\nPassword - " + password);

        assertEquals(password, PASSWORD, "Password is not correct!");


        System.out.println("\nCredentials are correct User can login.");
    }
}
