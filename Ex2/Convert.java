import pack1.Curr;
import pack1.Dist;
import pack1.Time;
import java.util.Scanner;
class Convert
{
    public static void main(String[] args)
    {
	Curr c=new Curr();
	Dist d=new Dist();
	Time t=new Time();
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the choice C,D or T");
	String q=in.next();
	System.out.println("Enter the value to be converted");
	double n=in.nextDouble();
	System.out.println("Enter the choice 1-6 for C&T, 1-4 for D");
	int v=in.nextInt();
	double r;
	switch(q)
	{
	    case "C":
		r=c.convert(n,v);
		System.out.println("Converted value="+r);
		break;
	    case "D":
		r=d.convert(n,v);
		System.out.println("Converted value="+r);
		break;
	    case "T":
		r=t.convert(n,v);
		System.out.println("Converted value="+r);
		break;
	    default:
		System.out.println("Invalid choice");
		break;
	}
    }
}
	
