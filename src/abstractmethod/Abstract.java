package abstractmethod;
import java.util.*;

public class Abstract
{
    public static void main(String[] args)
    {
        Bank1 sbi=new Bank1();
        sbi.getData();
        sbi.rateOfInterest();
        sbi.eligible();
        sbi.display();
        Bank2 hdfc=new Bank2();
        hdfc.getData();
        hdfc.rateOfInterest();
        hdfc.eligible();
        hdfc.display();
    }
}
