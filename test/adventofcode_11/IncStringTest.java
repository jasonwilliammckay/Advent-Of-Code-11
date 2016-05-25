package adventofcode_11;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class IncStringTest {
    
    public IncStringTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of incrementString method, of class IncString.
     */
    @Test
    public void testIncrementString() 
    {
        System.out.println("incrementString");
        assertEquals(null, IncString.incrementString(null));
        assertEquals("",   IncString.incrementString(""));
        assertEquals("b",  IncString.incrementString("a"));
        assertEquals("ab", IncString.incrementString("aa"));
        assertEquals("ba", IncString.incrementString("az"));
        assertEquals("aa", IncString.incrementString("zz"));
    }
    
}
