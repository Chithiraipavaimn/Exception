package Exception;
import java.util.*;
// Example for Array Index Out of Bounds Exception
public class ArrayBoundEx
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N: ");
        int N=scan.nextInt();
        int a[]=new int[N];
        int i;
        System.out.println("Enter Array: ");
        for(i=0;i<N;i++)
        {
            a[i]=scan.nextInt();
        }
        int sum=0;
        try
        {
            for(i=0;i<=N;i++)
            {
                sum=sum+a[i];
            }
            System.out.println("Sum is "+sum);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("Check if Index is correctly assigned or not.");
        }
    }
}
/*

Output:

Enter N:
3
Enter Array:
2
3
3
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
Check if Index is correctly assigned or not.


 */