package Exception;
import java.util.*;
// Example for Multiple Catch Block

public class MultipleCatchEx
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scan.nextInt();
        System.out.println("Enter b: ");
        int b= scan.nextInt();
        String s=null;
        int arr[]=new int[a];
        try
        {
            int c=a/b;
            System.out.println("Value for C is "+c);
            int d=s.length();
            System.out.println("Length of String "+d);
            arr[a+1]=9;
            System.out.println("value of array[a+1] is "+arr[a+1]);
            int f= Integer.parseInt(s);
            System.out.println("Value for f is "+f);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
/*

Output:

Example 1:
Enter a:
10
Enter b:
10
Value for C is 1
java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null


Example 2:

Enter a:
10
Enter b:
0
java.lang.ArithmeticException: / by zero

 */