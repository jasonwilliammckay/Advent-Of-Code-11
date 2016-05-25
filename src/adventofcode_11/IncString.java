package adventofcode_11;

/*
The purpose of this class is to increment a given string.

Incrementation of the string works much like numbers, just with lower-case
letters: aa -> ab -> ac. 'z' rolls over to 'a', incrementing the next-significant 
digit instead, so: ay -> az -> ba -> bb.

The puzzle doesn't specify what to do if the entire string overflows, so there
is an assumption that it rolls over to the 'smallest' value: zy -> zz -> aa.

*/

public class IncString 
{
    public static String incrementString(String target)
    {
        if (target != null)
        {
            int[] intArr = convertToInt(target);
            incrementArray(intArr, intArr.length-1);
            target = convertToString(intArr);
        }
        
        return target;
    }
    
    
    private static int[] convertToInt(String target)
    {
        char[] charArr = target.toCharArray();
        int[]  intArr = new int[charArr.length];
        
        for (int i = 0; i < charArr.length; i++)
            intArr[i] = charArr[i] - Constants.ASCII_ALPHA;        
        
        return intArr;
    }

    private static String convertToString(int[] intArr)
    {
        char[] charArr = new char[intArr.length];
        
        for (int i = 0; i < intArr.length; i++)
            charArr[i] = (char)(intArr[i] + Constants.ASCII_ALPHA);
        
        return new String(charArr);
    }
    
    private static void incrementArray(int[] arr, int pos)
    {
        if (pos < 0)
            rollOver(arr);
        
        else
        {
            arr[pos]++;

            if (arr[pos] > Constants.ALPHABET_SIZE)
            {
                arr[pos] = 1;
                incrementArray(arr, pos-1);
            }
        }
    }
    
    private static void rollOver(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            arr[i] = 1;
    }    
}
