package Exception;
import java.util.*;
// Example for Finally block
public class FinallyBl
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a[]=new int[5];
        try
        {
            a[6]=10;
            System.out.println("Length of array "+a.length);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally block will be executed always.");
            System.out.println("There is a time where finally block doesn't get executed. 1->System.exit(0) 2->if there is a error to abort the process.");
        }
    }
}

/*

Output:

Finally block will be executed always.
There is a time where finally block doesn't get executed. 1->System.exit(0) 2->if there is a error to abort the process.
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
	at Exception.FinallyBl.main(FinallyBl.java:12)

 */