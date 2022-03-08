package constructor;
import java.util.*;
// Default constructor example

public class DefaultConstructor
{
    int id;
    String name;
    DefaultConstructor()
    {
        System.out.println("ID : "+id);
        System.out.println("Name: "+name);
    }

}
class Student
{
    public static void main(String[] args)
    {
        DefaultConstructor dc=new DefaultConstructor();
    }
}
