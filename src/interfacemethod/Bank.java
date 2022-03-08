package interfacemethod;

 interface BankDetails
{
    float rateOfInterest();
    default void display()
    {
        System.out.println("For further process contact near by bank.");
    }
    static void display1()
    {
        System.out.println("We believe that the answers provided by you is true.");
    }
}
