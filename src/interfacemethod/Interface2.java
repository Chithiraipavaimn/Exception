package interfacemethod;

public class Interface2
{
    public static void main(String[] args)
    {
        Interface1 bank=new Interface1();
        bank.getData();
        bank.rateOfInterest();
        bank.eligible();
        bank.display();
        BankDetails.display1();
    }
}
