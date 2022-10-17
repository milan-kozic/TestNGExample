package testng;

import org.testng.annotations.Test;

@Test( groups = { Groups.REGRESSION} )
public class Example6BGroups {

    @Test( groups = { Groups.SANITY, Groups.SMOKE } )
    public void testA(){

        System.out.println("\nThis is TestA");
    }

    @Test (groups = { Groups.SMOKE })
    public void testB(){

        System.out.println("\nThis is TestB");
    }

    @Test (groups = { Groups.SMOKE, Groups.DEPRECATED })
    public void testC(){

        System.out.println("\nThis is TestC");
    }

    @Test
    public void testD(){

        System.out.println("\nThis is TestD");
    }

}
