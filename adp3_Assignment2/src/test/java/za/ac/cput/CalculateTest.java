package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

//for Testing Time Out
public class CalculateTest {

    Calculate calculate = new Calculate();
    private int add;

    @Before
    public void setUp() throws Exception {
        add = calculate.addition(15,15);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 1000)
    public void addition() throws InterruptedException{
        assertEquals(30, add);
    }

    @Test(timeout = 500)
    public void testTimeOut(){// Failing a test because the execution time exceeds the timeout
        try{
            sleep(1000 );
        } catch (InterruptedException e) {

        }
    }
}