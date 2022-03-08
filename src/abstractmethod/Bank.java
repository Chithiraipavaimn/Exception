package abstractmethod;

public abstract class Bank
{
    public abstract float rateOfInterest();
    public abstract void eligible();
    public void display()
    {
        System.out.println("For further process contact near by Bank.");
    }
}
