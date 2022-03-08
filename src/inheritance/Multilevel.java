package inheritance;

// Multilevel Inheritance example
class Animal1
{
    void role()
    {
        System.out.println("King of Forest.");
    }
    void sound()
    {
        System.out.println("It Roar.");
    }
}
class Lion1 extends Animal1
{
    void name()
    {
        System.out.println("Name of the animal is Lion.");
    }
}
class Cub extends Lion1
{
    void young()
    {
        System.out.println("Name for young one of Lion is Cub.");
    }
}

public class Multilevel
{
    public static void main(String[] args)
    {
        Cub c=new Cub();
        c.name();
        c.young();
        c.role();
        c.sound();
    }
}
