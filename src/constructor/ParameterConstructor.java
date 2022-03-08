package constructor;
import java.util.*;
// Parameter Constructor example
public class ParameterConstructor
{
    int id;
    String name;
    ParameterConstructor(int no,String na)
    {
        id=no;
        name=na;

    }
    void display()
    {
        System.out.println("No: "+id);
        System.out.println("Name: "+name);
    }
    public static void main(String args[])
    {
        ParameterConstructor pc=new ParameterConstructor(101,"Priya");
        ParameterConstructor pc1=new ParameterConstructor(102,"Dharshini");
        pc.display();
        pc1.display();
    }
}
