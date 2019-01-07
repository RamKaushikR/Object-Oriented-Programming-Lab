import java.util.Scanner;
class Factorial
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number");
	int f=in.nextInt();
	int i=2,p=1;
	if(f<0)
	    System.out.println("Invalid");
	else{
	    while(i<=f)
	    {
	        p*=i;
	        i++;
	    }
	    System.out.println(f+" factorial = "+p);
	}
    }
}
