package Exception;
import java.util.*;
// Example for Number Format Exception

public class NumberFormatEx
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=scan.next();
        char ch='A';
        try
        {
            int i=Integer.parseInt(s);
            System.out.println("Integer value for string is "+i);
        }
        catch (NumberFormatException e)
        {
            int j=(int)ch;
            System.out.println(e);
            System.out.println("Integer value for character is "+j);

        }
    }
}
/*

Output:

Enter String:
abc
java.lang.NumberFormatException: For input string: "abc"
Integer value for character is 65


 */