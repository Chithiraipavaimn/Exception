package inheritance;

class School
{
    public void syllabus()
    {
        System.out.println("Matric");
    }
    public void strength(int a,int b)
    {
        int sum=a+b;
        System.out.println("A+B: "+sum);
    }
}
class School1 extends School
{
    public void syllabus()
    {
        super.syllabus();
        System.out.println("CBSE");
    }
    public void strength(int a,int b,int c)
    {
        int sum=a+b+c;
        System.out.println("A+B+C: "+sum);
    }
}
public class Keyword
{
    public static void main(String[] args)
    {
        School1 sc=new School1();
        sc.syllabus();
        sc.strength(10,20);
        sc.strength(10,20,30);
    }
}
