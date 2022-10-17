package testng;

import org.testng.annotations.Test;

public class Example6AGroups {

    @Test( groups = { "sanity" } )
    public void testA(){

        System.out.println("\nThis is TestA");
    }


    @Test (groups = { "sanity", "regression" })
    public void testB(){

        System.out.println("\nThis is TestB");
    }

    @Test (groups = { "regression" })
    public void testC(){

        System.out.println("\nThis is TestC");
    }

}
