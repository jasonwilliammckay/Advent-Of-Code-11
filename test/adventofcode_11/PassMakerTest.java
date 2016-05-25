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

    @Test
    public void testGenerateNewPassword()
    {
        // null
        assertEquals("", PassMaker.generateNewPassword(null));
        // empty
        assertEquals("", PassMaker.generateNewPassword(""));
        // too short
        assertEquals("", PassMaker.generateNewPassword("abcdefg"));
        // non-alpha
        assertEquals("", PassMaker.generateNewPassword("12345678"));
        // the valid examples given in the puzzle
        assertEquals("abcdffaa", PassMaker.generateNewPassword("abcdefgh"));
        assertEquals("ghjaabcc", PassMaker.generateNewPassword("ghijklmn"));
    }
}