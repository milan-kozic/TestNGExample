package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example4BSoftAssert extends HelperClass {

    @Test( dataProviderClass = DataProviders.class, dataProvider = "credentials" )
    public void testAreCredentialsCorrect(String username, String password){

        SoftAssert softAssert = new SoftAssert();

        System.out.println("\nUsername - " + username);

        softAssert.assertEquals(username, USERNAME, "Wrong Username!");


        System.out.println("\nPassword - " + password);

        softAssert.assertEquals(password, PASSWORD, "Wrong Password!");


        softAssert.assertAll();

        System.out.println("\nCredentials are correct!");
    }


}
