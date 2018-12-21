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
    public void testDivisionTwoPositiveValues(){
        assertEquals ("10 / 2 must be 5",  5.0, calc.division( 10.0,  2.0));
    }
    @Test
    public void testDivisionTwoNegativeValues () {
        assertEquals ("-10 / -2 must be 5.0", 5.0, calc.division(-10, -2));
    }
    @Test
    public void testDivisionByZero(){
        assertEquals("10/0 must be ");

    }
    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
