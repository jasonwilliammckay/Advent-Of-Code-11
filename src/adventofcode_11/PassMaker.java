package adventofcode_11;

public class PassMaker 
{
    public static String generateNewPassword(String oldPass)
    {
        String password = IncString.incrementString(oldPass);
        
        while (!checkPassword(password))
            password = IncString.incrementString(password);
        
        return password;
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
