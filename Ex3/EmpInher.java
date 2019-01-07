import java.util.Scanner;
class Employee
{
    String name,address,mailid,mob;
    int empid;
    double bp,da,hra,pf,scf,gs,ns;
    void assign()
    {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the name, id, address, mail id & mobile no.");
	name=in.next();
	empid=in.nextInt();
	address=in.next();
	mailid=in.next();
	mob=in.next();
    }
    void calc(double b)
    {
	bp=b;
	da=0.94*b;
	hra=0.1*b;
	pf=0.12*b;
	scf=0.001*b;
	gs=bp+da+hra;
	ns=gs-pf;
    }
    void print()
    {
	System.out.println("Name:"+name+" ID:"+empid+" Address:"+address+" Mail:"+mailid+" Mobile:"+mob);
	System.out.println("BP:"+bp+" DA:"+da+" HRA:"+hra+" PF:"+pf+" SCF:"+scf+" Gross:"+gs+" Net:"+ns);
    }
}
class Programmer extends Employee
{
    double bp;
    void assign()
    {
	super.assign();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the basic pay");
	bp=in.nextDouble();
	calc(bp);
	print();
    }
}
class AssProf extends Employee
{
    double bp;
    void assign()
    {
	super.assign();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the basic pay");
	bp=in.nextDouble();
	calc(bp);
	print();
    }
}
class Aprof extends Employee
{
    double bp;
    void assign()
    {
	super.assign();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the basic pay");
	bp=in.nextDouble();
	calc(bp);
	print();
    }
}
class Professor extends Employee
{
    double bp;
    void assign()
    {
	super.assign();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the basic pay");
	bp=in.nextDouble();
	calc(bp);
	print();
    }
}
class EmpInher
{
    public static void main(String[] args)
    {
	String role;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the role");
	role=in.next();
	if(role.equals("Programmer"))
	{
	    Programmer p = new Programmer();
	    p.assign();
	}
	else if(role.equals("AssistantProf"))
	{
	    AssProf a = new AssProf();	
	    a.assign();
	}
	else if(role.equals("AssociateProf"))
	{
	    Aprof a = new Aprof();
	    a.assign();
	}
	else if(role.equals("Professor"))
	{
	    Professor p = new Professor();
	    p.assign();
	}
    }
}
