import java.util.Scanner;
class EvenorOdd
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the number");
	int b=in.nextInt();
	if(b%2==0)
    	    System.out.println(b+" is even");
	else
	    System.out.println(b+" is odd");
    }
}
