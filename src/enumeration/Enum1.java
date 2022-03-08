package enumeration;
import java.util.*;

public class Enum1
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the day you want: ");
        String w= scan.nextLine();
        Weeks we=Weeks.valueOf(w.toUpperCase());
        switch (we)
        {
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY:
                System.out.println("Weekday");
                break;
            case SATURDAY,SUNDAY:
                System.out.println("Weekend");
                break;
        }

    }
}
