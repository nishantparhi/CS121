import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ExampleClassTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** An example test. **/
   @Test public void giveMeFiveTest() {
      Assert.assertEquals("fiveMeFive gives me 5", ExampleClass.giveMeFive(), 5);
   }
}
