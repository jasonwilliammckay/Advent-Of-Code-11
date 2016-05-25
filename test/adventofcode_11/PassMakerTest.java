package adventofcode_11;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PassMakerTest {
    
    public PassMakerTest() {
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
     * Test of checkInput method, of class PassMaker.
     */
    @Test
    public void testCheckInput() 
    {
        // null
        assertEquals(false, PassMaker.checkInput(""));
        // empty
        assertEquals(false, PassMaker.checkInput(""));
        // too short
        assertEquals(false, PassMaker.checkInput("abcdefg"));
        // correct
        assertEquals(true, PassMaker.checkInput("abcdefgh"));
        // non-alpha
        assertEquals(false, PassMaker.checkInput("12345678"));
    }
    
    @Test
    public void testGenerateNewPassword()
    {
        // nulll input
        assertEquals("", PassMaker.generateNewPassword(null));
        // test the examples given in the puzzle
        assertEquals("abcdffaa", PassMaker.generateNewPassword("abcdefgh"));
        assertEquals("ghjaabcc", PassMaker.generateNewPassword("ghijklmn"));
    }
    
    
}
