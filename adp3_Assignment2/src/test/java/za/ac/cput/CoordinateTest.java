package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//for Testing Object Equality
public class CoordinateTest {
    private Coordinate coordinate;

    @Before
    public void setUp() {
        coordinate = new Coordinate(5,10);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getX() throws Exception{
        assertEquals(5, coordinate.getX());
    }

    @Test
    public void getY() throws Exception{
        assertEquals(10, coordinate.getY());
    }

    @Test
    public void testEquality(){
        assertEquals(coordinate.getX(), coordinate.getX());
    }
    @Test
    public void testEquality2(){
        assertNotEquals(coordinate.getX(),coordinate.getY());
    }

}