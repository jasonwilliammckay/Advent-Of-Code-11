package adventofcode_11;

public class PassMaker 
{
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
    
    protected static boolean checkInput(String pass)
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
