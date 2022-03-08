
// Method Overloading example
class Add
{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    String add(String name,String name1)
    {
        return name+name1;
    }
    String add(String name,String name1,String name2)
    {
        return name+name1+name2;
    }
}
public class MethodOverloading
{
    public static void main(String[] args)
    {
        Add a=new Add();
        System.out.println(a.add(10,20));
        System.out.println(a.add(10,20,30));
        System.out.println(a.add("Hello ","World"));
        System.out.println(a.add("Hello ","World, ","Java"));
    }
}
