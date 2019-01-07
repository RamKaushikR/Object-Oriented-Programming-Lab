import java.util.Scanner;
class MinorCitizenException extends Exception
{
    String s1;
    MinorCitizenException(String s2)
    {
	super(s2);
	s1=s2;
    }
    public String tostring()
    {
	return s1;
    }
}
class person
{
    String name,aadhar;
    int age;
    String getinput(String n, String a, String ad)
    {
	name=n;
	aadhar=ad;
	try
	{
	    age=Integer.parseInt(a);
	}
	catch(NumberFormatException e)
	{
	    return("Only numbers can be entered");
        }
	return "1";
    }
    void display()
    {
	System.out.println(name+" "+age+" "+aadhar);
    }
    void canVote()
    {
	try
	{
	    if(age<18)
		throw new MinorCitizenException("Age less than 18");
	}
	catch(MinorCitizenException exp)
	{
	    System.out.println(exp);
	}
    }
    String hasAadhar()
    {
	try
	{
	    if(aadhar.length()!=12 || aadhar.charAt(0)=='0')
		throw new NullPointerException("Invalid aadhar number");
	    return "1";
	}
	catch(NullPointerException f)
	{
	    return f;
        }
    }
}
class Person
{
     public static void main(String[] args)
     {
	 Scanner in=new Scanner(System.in);
	 String n,a,ad,c,q;
	 System.out.println("Enter name,age,aadhar");
	 n=in.next();
	 a=in.next();
	 ad=in.next();
	 person p=new person();
	 c=p.getinput(n,a,ad);
	 if(c=="1")
	 {
	     q=p.hasAadhar();
	     if(q=="1")
	     {
		 p.display();
		 p.canVote();
	     }
	     else
		 System.out.println(q);
	 }
	 else
	     System.out.println(c);
     }
}
