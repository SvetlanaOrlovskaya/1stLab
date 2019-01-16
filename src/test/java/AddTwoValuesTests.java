import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    @Test
    public void testMultiplyPositiveValue() {
        assertEquals("5 * 5 must be 25", 25, calc.multiply(5, 5));
    }
    @Test
    public void testDivisionTwoPositiveValues() throws Exception {
        assertEquals ("10 / 2 must be 5",  5, calc.division( 10,  2));
        //
    }
    @Test
    public void testDivisionTwoNegativeValues () throws Exception {
        assertEquals ("-10 / -2 must be 5.0", 5.0, calc.division(-10, -2));
    }
    @Test
    public void testDivideZero() {
        try{
            calc.division(20,0);
            assertEquals("Somthing Wrong",true,false);
        }catch(Exception ae){
            assertEquals("You shouldnt do it","/ by zero", ae.getMessage());
        }
    }
    @Test
    public void testSquare (){
        assertEquals("sqrt from 25.0 should be 5.0", 5.0, calc.square(25));
    }

    @Test
    public void testPower (){
        assertEquals("5.0 pow to 2.0 should be 25.0", 25.0, calc.power(5.0, 2.0));
    }
    //TODO


    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
