import java.util.Scanner;
abstract class Loan
{
    String name,address,username="ramk",password="rakesh123";
    int acc_num;
    int login_method(String u, String p)
    {
	if(!(username.equals(u) && password.equals(p)))
	{
	    return 0;
	}
	return 1;
    }
    abstract void sanction_loan();
}
class EducationLoan extends Loan
{
    Scanner in = new Scanner(System.in);
    int age;
    String qualification,u,p;
    double sancamt;
    void sanction_loan()
    {
	if(age>18 && qualification.equals("12"))
	    sancamt=100000.0;
	else if(age>21 && qualification.equals("Arts_Degree"))
	    sancamt=200000.0;
	else if(age>22 && qualification.equals("Engineering_Bachelors_Degree"))
	    sancamt=300000.0;
	else
	{
	    sancamt=0.0;
	    System.out.println("Invalid");
	}
    }
    void display()
    {
	System.out.println("Account no.:"+acc_num+" Name:"+name+" Age:"+age+" Address:"+address);
	System.out.println("Qualification:"+qualification+" Sanctioned amount:"+sancamt);
    }
    void enter()
    {
	System.out.println("Enter username");
	u=in.next();
	System.out.println("Enter password");
	p=in.next();
	int q=login_method(u,p);
	if(q==0)
	{
	    System.out.println("Invalid username/password");
	}
	else
	{
	    System.out.println("Enter account no,name,age,qualification & address");
	    acc_num=in.nextInt();
	    name=in.next();
	    age=in.nextInt();
	    qualification=in.next();
	    address=in.next();
	    sanction_loan();
	    display();
	}
    }
}
class HousingLoan extends Loan
{
    double income,loanamt,sancamt;
    String u,p;
    int age;
    Scanner in=new Scanner(System.in);
    void sanction_loan()
    {
	 if(income>1500000)
	     sancamt=0.7*loanamt;
	 else if(income>1000000)
	     sancamt=0.5*loanamt;
	 else if(income>500000)
	     sancamt=0.3*loanamt;
	 else
	 {
	     sancamt=0.0;
	     System.out.println("invalid");
	 }
    }
    void display()
    {
	System.out.println("Account no.:"+acc_num+" Name:"+name+" Age:"+age+" Address:"+address);
	System.out.println("Income:"+income+" Loan amount:"+loanamt+" Sanctioned amount:"+sancamt);
    }
    void enter()
    {
	System.out.println("Enter username");
	u=in.next();
	System.out.println("Enter password");
	p=in.next();
	int c=login_method(u,p);
	if(c==0)
	    System.out.println("Invalid username/password");
	else
	{
	    System.out.println("Enter account no,name,age,address,income & loan amount");
	    acc_num=in.nextInt();
	    name=in.next();
	    age=in.nextInt();
	    address=in.next();
	    income=in.nextDouble();
	    loanamt=in.nextDouble();
	    sanction_loan();
	    display();
	}
    }
}
class AbstractLoan
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter choice 1.Education Loan 2.Housing Loan");
	int choice=in.nextInt();
	if(choice==1)
	{
	    EducationLoan e = new EducationLoan();
	    e.enter();
	}
	else if(choice==2)
	{
	    HousingLoan h = new HousingLoan();
	    h.enter();
	}
    }
}
	    
    
	
		
