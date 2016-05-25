package adventofcode_11;

// per http://adventofcode.com/day/11 parts 1 and 2

public class AdventOfCode_11 
{
    public static void main(String[] args)
    {
        String oldPass = Constants.INPUT;
        
        String newPass1 = PassMaker.generateNewPassword(oldPass);
        System.out.println("The first new password is: " + newPass1 + ".");

        String newPass2 = PassMaker.generateNewPassword(newPass1);
        System.out.println("The second new password is: " + newPass2 + ".");
    }
}