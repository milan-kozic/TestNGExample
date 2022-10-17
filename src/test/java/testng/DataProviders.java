package testng;

import org.testng.annotations.DataProvider;

public class DataProviders {


    @DataProvider( name = "anyTwoNumbers", parallel = true )
    private Object[][] provideTwoNumbers(){

        return new Object[][] {
                {5, -2} ,
                {556, 1000} ,
                {-400, -87} ,
                {999, 666}
        };
    }

    @DataProvider (name = "credentials")
    private Object[][] usernameAndPassword(){

        return new Object[][] {
                {"Nick Cave", "and_the_Bad_Seeds"},
                {"username", "Mordor123!@#"} ,
                {"username", "qwerty"}
        };
    }

}
