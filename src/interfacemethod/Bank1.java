package interfacemethod;

interface BankDetails1 extends BankDetails
{
    void eligible();
    default void display()
    {
        System.out.println("For further Process ready with your related documents.");
    }
}
