import java.util.Scanner;
class EB
{
    private int cno,pmr,cmr;
    private float total;
    private String cname,ctype;
    void assign(int a, String e, int b, int c, String f)
    {
	cno=a;
	pmr=b;
	cmr=c;
	cname=e;
	ctype=f;
    }
    void domestic()
    {
	int d=cmr-pmr;
	if(d<101)
	    total=(float) d;
   	else if(d<201)
	{
	    total=(float) (d-100)*5;
       	    total/=2;
	    total+=100.0;
	}
	else if(d<501)
	    total=(float) 100+250+(d-200)*4;
	else
	    total=(float) 100+250+1200+(d-500)*6;
    }
    void commercial()
    {
	int d=cmr-pmr;
	if(d<101)
	    total=(float) d*2;
   	else if(d<201)
	{
	    total=(float) (d-100)*9;
	    total/=2;
	    total+=200.0;
	}
	else if(d<501)
	    total=(float) 200+450+(d-200)*6;
	else
	    total=(float) 200+450+1800+(d-500)*7;
    }
    
    void display()
    {
	System.out.println(cno+" "+cname+" "+pmr+" "+cmr+" "+ctype+" "+total);
    }
}
class ElectricityBill
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	EB e=new EB();
	System.out.println("Enter consumer no.");
	int b=in.nextInt();
	System.out.println("Enter consumer name");
	String a=in.next();
	System.out.println("Enter previous month reading");
	int c=in.nextInt();
	System.out.println("Enter current month reading");
	int d=in.nextInt();
	System.out.println("Enter consumer type");
	String f=in.next();
	e.assign(b,a,c,d,f);
	if(a.equals("Domestic"))
	    e.domestic();
	else 
	    e.commercial();
	e.display();
    }
}
	   
