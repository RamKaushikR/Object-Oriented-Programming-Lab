import java.util.Scanner;
class Emp
{
    String name,des;
    int id,yoe,nhw,hw;
    double bp,da,hra,lic,pf,gs,de,ns;
    void assign(String n, int i, String d, int y, double b, double da, double h, double l, double p, int nh, int ho)
    {
	name=n;
	id=i;
	des=d;
	yoe=y;
	bp=b;
	this.da=da;
	hra=h;
	lic=l;
	pf=p;
	nhw=nh;
	hw=ho;
    }
    void intern()
    {
	gs=(double) (nhw*hw)+3000;
	de=(double) lic+500;
	ns=gs-de;
    }
    void manager()
    {
	gs=bp*1.5;
	de=(double) lic+(8*bp/100);
	ns=gs-de;
    }
    void other()
    {
	gs=bp*1.4;
	de=(double) lic+(8*bp/100);
	ns=gs-de;
    }
    void display()
    {
	System.out.println(name+" "+id+" "+des+" "+yoe);
	System.out.println(bp+" "+da+" "+hra+" "+lic+" "+pf+" "+" "+nhw);
	System.out.println(gs+" "+de+" "+ns);
    }
}
class Employee
{
    public static void main(String[] args)
    {
	Scanner in=new Scanner(System.in);
	Emp[] e;
	System.out.println("Enter no. of employees");
	int n=in.nextInt();
	e=new Emp[n];
	for(int i=0;i<n;i++)
	{
	    int id,yoe,nhw,hw;
	    String name,des;
	    double bp,lic;
	    System.out.println("Enter name");
	    name=in.next();
	    System.out.println("Enter id");
	    id=in.nextInt();
	    System.out.println("Enter designation");
	    des=in.next();
	    System.out.println("Enter years of experience");
	    yoe=in.nextInt();
	    System.out.println("Enter basic pay");
	    bp=in.nextDouble();
	    System.out.println("Enter lic");
	    lic=in.nextDouble();
	    System.out.println("Enter no. of hours worked if intern otherwise 0");
	    nhw=in.nextInt();
	    e[i]=new Emp();
	    if(des.equals("Intern"))
	    {
		System.out.println("Enter hourly wage");
		hw=in.nextInt();
		e[i].assign(name,id,des,yoe,bp,2000.0,1000.0,lic,500.0,nhw,hw);
		e[i].intern();
	    }
	    else if(des.equals("Manager"))
	    {
		e[i].assign(name,id,des,yoe,bp,0.4*bp,0.1*bp,lic,0.08*bp,nhw,0);
		e[i].manager();
	    }
	    else
	    {
		e[i].assign(name,id,des,yoe,bp,0.4*bp,0.1*bp,lic,0.08*bp,nhw,0);
		e[i].other();
	    }
	    e[i].display();
	}
    }
}
	    
