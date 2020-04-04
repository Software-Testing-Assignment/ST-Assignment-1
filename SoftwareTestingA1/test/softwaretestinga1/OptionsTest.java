
package softwaretestinga1;


import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@RunWith(Parameterized.class)
public class OptionsTest {
    private String c;
     private String g;     

  
     @BeforeMethod
    public void details()
    {
        System.out.println("Please select the Game accroding to the Console.");
                    System.out.println("Option for Console is :");
                    System.out.println("1.PS4");
                    System.out.println("2.XBOX");
                    System.out.println("");
                    System.out.println("Option for Games is :");
                    System.out.println();
                    System.out.println("1.COD PS4");
                    System.out.println("2.COD XBOX");
                    System.out.println("");
    }
    public OptionsTest(String c,String g) {
        this.c=c;
        this.g=g;
        
    }
    
    @Parameterized.Parameters
    public static Collection parameters()
    {
       return Arrays.asList(new Object[][] {
           {"XBOX","COD PS4"},
           {"PS4","COD PS4"},
           {"XBOX","COD XBOX"}
       });
    }
    /**
     * Test of function1 method, of class Options.
     */
   
    
    @Test
    public void testFunction1() {
   
     String v1="PS4";
     String v2="XBOX";
     String v3="COD XBOX";
     String v4="COD PS4";
     String v5=null;
     if(v1.equals(v5)&&v3.equals(v5) || c.equals(v5)&& g.equals(v5))
     {
         assertNull(v5);
     }
     
     Options p=new Options();
     boolean expected=true;
     boolean value=p.function1(v1,v3);
     boolean value2=p.function1(c,g);
     boolean value3=p.function1(c,g);
     boolean value4=p.function1(c,g);
    
     assertEquals(expected,value);
     assertNotEquals(expected,value2);
     assertNotEquals(expected,value3);
     assertNotEquals(expected,value4);
     
     assertTrue(value);
     assertFalse(value2);
     assertFalse(value3);
     assertFalse(value4);
     
     
     assertNotNull(value);
     assertNotNull(value2);
     assertNotNull(value3);
     assertNotNull(value4);
     
     assertNotSame(v1,v2);
     assertNotSame(v1,v3);
     assertNotSame(v1,v4);
     assertNotSame(v2,v1);
     assertNotSame(v2,v3);
     assertNotSame(v2,v4);
     assertNotSame(v3,v1);
     assertNotSame(v3,v2);
     assertNotSame(v3,v4);
     assertNotSame(v4,v1);
     assertNotSame(v4,v2);
     assertNotSame(v4,v3);
     
     assertSame(c,c);
     assertSame(g,g);
     
    
     //fail();//we use this to check if it actually failed the test or not.
    }
     

    /**
     * Test of function2 method, of class Options.
     */
    
    
    
    @Test
    public void testFunction2() {
       
     String v1="PS4";
     String v2="XBOX";
     String v3="COD XBOX";
     String v4="COD PS4";
     String v5=null;
     if(v1.equals(v5)&&v3.equals(v5) || c.equals(v5)&& g.equals(v5))
     {
         assertNull(v5);
     }
     Options p=new Options();
     boolean expected=true;
     boolean value=p.function2(v2,v4);
     boolean value2=p.function2(v2,v3);
     boolean value3=p.function2(v1,v3);
     boolean value4=p.function2(v1,v4);
     assertEquals(expected,value);
     assertNotEquals(expected,value2);
     assertNotEquals(expected,value3);
     assertNotEquals(expected,value4);
     
     assertTrue(value);
     assertFalse(value2);
     assertFalse(value3);
     assertFalse(value4);
     
      assertNotNull(value);
     assertNotNull(value2);
     assertNotNull(value3);
     assertNotNull(value4);
     
     assertNotSame(v1,v2);
     assertNotSame(v1,v4);
     assertNotSame(v2,v1);
     assertNotSame(v2,v3);
     assertNotSame(v2,v4);
     assertNotSame(v3,v1);
     assertNotSame(v3,v2);
     assertNotSame(v3,v4);
     assertNotSame(v4,v1);
     assertNotSame(v4,v2);
     assertNotSame(v4,v3);
     
     assertSame(c,c);
     assertSame(g,g);
     
    //fail(); //we use this to check if it actually failed the test or not.
    }

    /**
     * Test of function3 method, of class Options.
     */
    @Test
    public void testFunction3() {
     String v1="PS4";
     String v2="XBOX";
     String v3="COD XBOX";
     String v4="COD PS4";
     String v5=null;
     if(v1.equals(v5)&&v3.equals(v5) || c.equals(v5)&& g.equals(v5))
     {
         assertNull(v5);
     }
     Options p=new Options();
     boolean expected=true;
     boolean value=p.function3(v1,v4);
     boolean value2=p.function3(v2,v3);
     boolean value3=p.function3(v1,v3);
     boolean value4=p.function3(v2,v4);
     assertEquals(expected,value);
     assertNotEquals(expected,value2);
     assertNotEquals(expected,value3);
     assertNotEquals(expected,value4);
     
     assertTrue(value);
     assertFalse(value2);
     assertFalse(value3);
     assertFalse(value4);
     
      assertNotNull(value);
     assertNotNull(value2);
     assertNotNull(value3);
     assertNotNull(value4);
     
     assertNotSame(v1,v2);
     assertNotSame(v1,v4);
     assertNotSame(v2,v1);
     assertNotSame(v2,v3);
     assertNotSame(v2,v4);
     assertNotSame(v3,v1);
     assertNotSame(v3,v2);
     assertNotSame(v3,v4);
     assertNotSame(v4,v1);
     assertNotSame(v4,v2);
     assertNotSame(v4,v3);
     
     assertSame(c,c);
     assertSame(g,g);
     
    //fail(); //we use this to check if it actually failed the test or not.
     
     
    }

    /**
     * Test of function4 method, of class Options.
     */
    @Test
    public void testFunction4() {
     String v1="PS4";
     String v2="XBOX";
     String v3="COD XBOX";
     String v4="COD PS4";
     String v5=null;
     if(v1.equals(v5)&&v3.equals(v5) || c.equals(v5)&& g.equals(v5))
     {
         assertNull(v5);
     }
     Options p=new Options();
     boolean expected=true;
     boolean value=p.function4(v2,v3);
     boolean value2=p.function4(v2,v4);
     boolean value3=p.function4(v1,v3);
     boolean value4=p.function4(v1,v4);
     assertEquals(expected,value);
     assertNotEquals(expected,value2);
     assertNotEquals(expected,value3);
     assertNotEquals(expected,value4);
     
     assertTrue(value);
     assertFalse(value2);
     assertFalse(value3);
     assertFalse(value4);
     
      assertNotNull(value);
     assertNotNull(value2);
     assertNotNull(value3);
     assertNotNull(value4);
     
     assertNotSame(v1,v2);
     assertNotSame(v1,v4);
     assertNotSame(v2,v1);
     assertNotSame(v2,v3);
     assertNotSame(v2,v4);
     assertNotSame(v3,v1);
     assertNotSame(v3,v2);
     assertNotSame(v3,v4);
     assertNotSame(v4,v1);
     assertNotSame(v4,v2);
     assertNotSame(v4,v3);
     
     assertSame(c,c);
     assertSame(g,g);
     
    //fail(); //we use this to check if it actually failed the test or not.
    }
    @AfterMethod
    public void afterDetail()
    {
        System.out.println("Thanks for choosing the Game. ");
    }
    
}
