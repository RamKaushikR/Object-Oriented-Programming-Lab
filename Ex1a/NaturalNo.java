import java.util.Scanner;
class NaturalNo
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number");
	int a=in.nextInt();
	int s=0;
	for(int i=1;i<=a;i++)
	    s+=i;
	System.out.println("Sum of first "+a+" natural no.s ="+s);
    }
}
