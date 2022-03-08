package inheritance;
// Hierarchical Inheritance example

class Animal2
{
    void eat()
    {
        System.out.println("Hunt its prey.");
    }
}
class Lion2 extends Animal2
{
    void role()
    {
        System.out.println("King of Jungle.");
    }
    void sound()
    {
        System.out.println("It Roar.");
    }
}
class Tiger extends Animal2
{
    void role()
    {
        System.out.println("National Animal");
    }
    void sound()
    {
        System.out.println("It Roar.");
    }
}
public class Hierarchical
{
    public static void main(String args[])
    {
        Tiger t=new Tiger();
        t.role();
        t.sound();
        t.eat();
    }
}
