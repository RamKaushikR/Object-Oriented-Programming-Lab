import java.util.Scanner;
import java.lang.Math;
class Armstrong
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number");
	int n=in.nextInt();
	int d=0,s=0,p=n,q=n;
	while(p>0)
	{
	    d++;
	    p/=10;
	}
	while(n>0)
	{
	    s+=Math.pow(n%10,d);
	    n/=10;
	}
	if(s==q)
	    System.out.println("Armstrong");
	else
	    System.out.println("Not Armstrong");
    }
}
