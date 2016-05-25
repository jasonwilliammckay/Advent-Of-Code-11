package adventofcode_11;

/*
StrValidate contains helper functions that scans strings for certain properties
*/

public class StrValidate 
{
    // checks if any substring has 3 sequential characters
    // ie. 'abc' returns true while 'abd' does not
    static Boolean findStraight(String target)
    {
        boolean found = false;

        if (target != null && target.length() > 2)
        {
            for (int i = 0; i < target.length()-2; i++)
            {
                int one = target.charAt(i);
                int two = target.charAt(i+1) - 1;
                int three = target.charAt(i+2) - 2;
                if (one == two && two == three)
                    found = true;
            }
        }
        return found;
    }

    // checks if a string contains any forbidden characters or not
    // returns true if nothing invalid is found
    // returns false if an invalid character is found, or if the input is null
    static Boolean checkValidChars(String target)
    {
        boolean found = true;

        if (target != null)
        {
            for (int i = 0; i < target.length(); i++)
                if (target.charAt(i) == 'i' || target.charAt(i) == 'o' || target.charAt(i) == 'l')
                    found = false;
        }
        else
            found = false;
        
        return found;
    }

    // checks if a string contains at least two pairs of characters
    // pairs cannot overlap (ie. 'aaa' is not two pairs)
    static Boolean checkPairs(String target)
    {
        int numPairs = 0;
        boolean found = false;

        if (target != null)
        {
            for (int i = 1; i < target.length(); i++)
            {
                if (target.charAt(i) == target.charAt(i-1))
                {
                    numPairs++;

                    if (i != target.length() - 1) // don't step out of bounds
                        i++;
                }
            }

            if (numPairs > 1)
                found = true;
        }
        return found;
    }
}