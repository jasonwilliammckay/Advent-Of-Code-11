package adventofcode_11;

/*
PassMaker is in charge of generating new passwords given a starting seed
*/

public class PassMaker 
{
    // Repeatedly generate new passwords until a valid password is produced
    // Return an empty string if the input seed is malformed
    public static String generateNewPassword(String oldPass)
    {
        String password;
        
        if (oldPass != null && checkInput(oldPass))
        {
            password = IncString.incrementString(oldPass);

            while (!checkPassword(password))
                password = IncString.incrementString(password);
        }
        
        else
            password = "";
        
        return password;
    }
    
    // verifies that the input is the required length and is only alpha chars
    private static boolean checkInput(String pass)
    {
        boolean valid = true;
        
        if (pass == null || pass.length() != Constants.PASS_LENGTH)
            valid = false;
        
        else
        {
            for (char i: pass.toCharArray())
                if (i < 'a' || i > 'z')
                    valid = false;
        }
        
        return valid;
    }
    
    // checks if the input doesn't fail any of the validation checks
    private static boolean checkPassword(String input)
    {
        boolean valid = true;
        
        if (!StrValidate.checkPairs(input))
            valid = false;
        
        if (!StrValidate.checkValidChars(input))
            valid = false;
        
        if (!StrValidate.findStraight(input))
            valid = false;
        
        return valid;
    }       
}
