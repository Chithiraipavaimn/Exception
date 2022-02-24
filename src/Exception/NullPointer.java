package Exception;
import java.util.*;
// Example for Null Pointer Exception

public class NullPointer
{
    public static void main(String[] args)
    {
        //  Scanner scan=new Scanner(System.in);
        int a=0;
        String s=null;
        try
        {
            int b=a;
            int c=s.length();
            System.out.println("Length of a "+b+" and String s is "+c);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
            System.out.println("The given Value must be Null so it throws Exception");
        }
    }
}
/*

Output:


java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
The given Value must be Null so it throws Exception


 */