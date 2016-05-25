package adventofcode_11;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StrValidateTest {
    
    public StrValidateTest() {
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
     * Test of findStraight method, of class StrValidate.
     */
    @Test
    public void testFindStraight() 
    {   // finds if a substring of 3 sequential letters exists
        System.out.println("findStraight");
        assertEquals(false, StrValidate.findStraight(null));
        assertEquals(false, StrValidate.findStraight(""));
        assertEquals(false, StrValidate.findStraight("a"));
        assertEquals(false, StrValidate.findStraight("ab"));
        assertEquals(false, StrValidate.findStraight("cba"));
        assertEquals(false, StrValidate.findStraight("aaa"));
        assertEquals(false, StrValidate.findStraight("abd"));
        assertEquals(true, StrValidate.findStraight("abc"));
        assertEquals(true, StrValidate.findStraight("ijkzzz"));
        assertEquals(true, StrValidate.findStraight("aaaijkzzz"));
        assertEquals(true, StrValidate.findStraight("aaaijk"));
    }

    /**
     * Test of checkValidChars method, of class StrValidate.
     */
    @Test
    public void testCheckValidChars() 
    {   // returns false if one of: {'i', 'o', 'l'} are present, or if null
        System.out.println("checkValidChars");
        assertEquals(false, StrValidate.checkValidChars(null));
        assertEquals(false, StrValidate.checkValidChars("i"));
        assertEquals(false, StrValidate.checkValidChars("i_"));
        assertEquals(false, StrValidate.checkValidChars("_i_"));
        assertEquals(false, StrValidate.checkValidChars("_i"));
        assertEquals(false, StrValidate.checkValidChars("o"));
        assertEquals(false, StrValidate.checkValidChars("o_"));
        assertEquals(false, StrValidate.checkValidChars("_o_"));
        assertEquals(false, StrValidate.checkValidChars("_o"));
        assertEquals(false, StrValidate.checkValidChars("l"));
        assertEquals(false, StrValidate.checkValidChars("l_"));
        assertEquals(false, StrValidate.checkValidChars("_l_"));
        assertEquals(false, StrValidate.checkValidChars("_l"));
        assertEquals(true, StrValidate.checkValidChars(""));
        assertEquals(true, StrValidate.checkValidChars(" "));
        assertEquals(true, StrValidate.checkValidChars("abcdefghjkmnpqrstuvwxyz"));
    }

    /**
     * Test of checkPairs method, of class StrValidate.
     */
    @Test
    public void testCheckPairs() 
    {  // returns true if there are two pairs of characters
        System.out.println("checkPairs");
        assertEquals(false, StrValidate.checkPairs(null));
        assertEquals(false, StrValidate.checkPairs(""));
        assertEquals(false, StrValidate.checkPairs(" "));
        assertEquals(false, StrValidate.checkPairs("qq"));
        assertEquals(false, StrValidate.checkPairs("qqq"));
        assertEquals(false, StrValidate.checkPairs("abcdefghijklmnopqrstuvwxyz"));
        assertEquals(true, StrValidate.checkPairs("qqqq"));
        assertEquals(true, StrValidate.checkPairs("qqzz"));
        assertEquals(true, StrValidate.checkPairs("qq_zz"));
        assertEquals(true, StrValidate.checkPairs("_qqzz"));
        assertEquals(true, StrValidate.checkPairs("qqzz_"));
        assertEquals(true, StrValidate.checkPairs("_qq_zz_"));
    }
    
}
