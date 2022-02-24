package Exception;
import java.util.*;
// Example for Nested Try

public class NestedTryEx
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scan.nextInt();
        System.out.println("Enter b: ");
        int b= scan.nextInt();
        String s="abc";
        int arr[]=new int[a];
        try
        {
            try
            {
                int c=a/b;
                System.out.println("Value for C is "+c);
                try
                {
                    int d=s.length();
                    System.out.println("Length of string is "+d);
                    try
                    {
                        arr[a+3]=13;
                        System.out.println("Array length "+arr.length);
                    }
                    catch (ArrayIndexOutOfBoundsException e)
                    {
                        System.out.println(e);
                    }
                }
                catch (NullPointerException e)
                {
                    System.out.println(e);
                }
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
/*

Output:


Enter a:
20
Enter b:
20
Value for C is 1
Length of string is 3
java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 20

 */