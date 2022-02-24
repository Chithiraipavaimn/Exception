package Exception;
import java.util.*;
// Example for arithmetic exception

public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scan.nextInt();
        System.out.println("Enter b: ");
        int b=scan.nextInt();
        int c=0,d=0;
        try
        {
            c=a%b;
            d=a/b;
            System.out.println("There is no Arithmetic Exception in this code");
            System.out.println("Answer for C is "+c+ " and D is "+d);
        }
        catch(ArithmeticException g)
        {
            System.out.println(g);
            System.out.println("Due to Arithmetic Exception it is not further proceeded.");
        }

    }
}
/*

Output:

Example 1:

Enter a:
20
Enter b:
0
java.lang.ArithmeticException: / by zero
Due to Arithmetic Exception it is not further proceeded.


Example 2:

Enter a:
20
Enter b:
20
There is no Arithmetic Exception in this code
Answer for C is 0 and D is 1

 */