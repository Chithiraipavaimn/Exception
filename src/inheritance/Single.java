package inheritance;

import jdk.swing.interop.LightweightContentWrapper;

// Single Heritance example
class Animal
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
class Lion extends Animal
{
    void name()
    {
        System.out.println("Name of the animal is Lion.");
    }
}
public class Single
{
    public static void main(String[] args)
    {
        Lion l=new Lion();
        l.name();
        l.role();
        l.sound();
    }
}
