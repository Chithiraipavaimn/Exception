package abstractmethod;
import java.util.*;

public class Bank2 extends Bank
{
    Scanner scan=new Scanner(System.in);
    int age;
    long salary;
    long loanamt;
    public void getData()
    {
        System.out.println("HDFC Bank");
        System.out.println("Enter the age: ");
        age=scan.nextInt();
        if(age>=18)
        {
            System.out.println("Enter your salary: ");
            salary = scan.nextLong();
        }
    }
    public float rateOfInterest()
    {
        float interestrate=0;
        System.out.println("Enter your choice for loan: 1->Education loan 2->Personal Loan 3->Home loan: ");
        int option=scan.nextInt();
        switch(option)
        {
            case 1:
                scan.nextLine();
                System.out.println("Enter your place for study: Abroad or India: ");
                String country=scan.nextLine();
                if(age>=18 && age<=35)
                {
                    if(country.equals("Abroad"))
                    {
                        loanamt=2000000;
                    }
                    else
                    {
                        loanamt=3500000;
                    }
                }
                interestrate=11.9F;
                break;
            case 2:
                if(age>=18 && age<76 && salary>=50000)
                {
                    loanamt=1000000;
                }
                interestrate= 9.50F;
                break;
            case 3:
                if(age>=18 && age<=70 && salary>=50000)
                {
                    loanamt=4600000;
                }
                interestrate=11.1F;
                break;

        }
        return interestrate;
    }
    public void eligible()
    {
        if(loanamt==0 && age<18)
        {
            System.out.println("You are not eligible to get loan.");
        }
        else
        {
            System.out.println("Your loan is processed and the loan amount is "+loanamt);
        }
    }
}
