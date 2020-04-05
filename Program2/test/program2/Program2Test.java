package program2;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static program2.Program2.functionAdd;

@RunWith(Parameterized.class)
public class Program2Test {
    private double a;
    private double b;
    private double c;
    
    public Program2Test(double a, double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Parameterized.Parameters
    public static Collection parameters()
    {
       return Arrays.asList(new Object[][] {
           {1,5,6},
           {2,8,10},
           {18,10,5},
           {7,1,6},
           {6,6,6},
            {-25,-35,5},
            {-202,1,3}
       });
    }
    @BeforeMethod
    void details()
    {
         System.out.println("This is a quadratic formula give values according to your desire.");
    }
    /**
     * Test of functionAdd method, of class Program2.
     */
    @Test
    public void testFunctionAdd() {
        boolean expected=true;
        boolean value=functionAdd(a,b,c);
        boolean value2=functionAdd(0,b,c);
       
        assertEquals(expected,value);
        assertNotEquals(expected,value2);
        
        assertTrue(value);
        assertFalse(value2);
        
        assertNotNull(value);
        assertNotNull(value2);
        
        assertNotSame(expected,value2);
        assertSame(expected,value);
        
        //fail();//we use this to check if it actually failed the test or not.
        
    }

    /**
     * Test of functionMinus method, of class Program2.
     */
    @RepeatedTest(4)
    public void testFunctionMinus(RepetitionInfo repetitionInfo) {
        assertEquals(5,repetitionInfo.getTotalRepetitions());
        
        boolean expected=true;
        boolean value=functionAdd(a,b,c);
        boolean value2=functionAdd(0,b,c);
       
        assertEquals(expected,value);
        assertNotEquals(expected,value2);
        
        assertTrue(value);
        assertFalse(value2);
        
        assertNotNull(value);
        assertNotNull(value2);
        
        assertNotSame(expected,value2);
        assertSame(expected,value);
        
       
        
        //fail();//we use this to check if it actually failed the test or not.
    }

   
    @AfterMethod
    public void afterDetails()
    {
         System.out.println("The Values of Quadratic Formula is as showed above.");
   
    }
    
}
