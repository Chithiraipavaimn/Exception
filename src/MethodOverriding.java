// Method Overriding example

class Animal3
{
    void sound()
    {
        System.out.println("All Animals have their unique sound.");
    }
}
class Dog extends Animal3
{
    void sound()
    {
        System.out.println("Dog's Nature is to bark");
    }
}
class Lion extends Animal3
{
    void sound()
    {
        System.out.println("Lion's Nature is to Roar");
    }
}
public class MethodOverriding
{
    public static void main(String[] args)
    {
        Animal3 an=new Animal3();
        an.sound();
        Dog d=new Dog();
        d.sound();
        Lion l=new Lion();
        l.sound();
    }
}
