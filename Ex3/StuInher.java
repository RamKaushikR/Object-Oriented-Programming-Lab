import java.util.Scanner;
class Person
{
    String name,address,dob;
    int age;
    void assign()
    {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the name, address, date of birth(dd/mm/yyyy) & age");
	name=in.next();
	address=in.next();
	dob=in.next();
	age=in.nextInt();
    }
    void calc_perf()
    {
	;
    }
    void display()
    {
	;
    }
}
class Student extends Person
{
    String dept,ec,g,perf;
    double[] d=new double[3];
    void assign()
    {	
	Scanner in=new Scanner(System.in);
        super.assign();
	System.out.println("Enter the department");
   	dept=in.next();
	double s=0.0;
	System.out.println("Enter the 3 marks");
	for(int i=0;i<3;i++)
	{
 	    d[i]=in.nextDouble();
 	    s+=d[i];
        }
	s=s/3;
 	if(s>90)
            g="A";
	else if (s>80)
	    g="B";
	else if (s>70)
	    g="C";
	else 
	    g="D";
	System.out.println("Enter extra-curricular grade");
        ec=in.next();
    }
    void calc_perf()
    {
	if(g.equals("A") && ec.equals("A"))
	    perf="Outstanding";
	else if(g.equals("D") || ec.equals("D"))
	    perf="Fair";
	else if(g.equals("C") || ec.equals("C"))
	    perf="Good";
	else if(g.equals("B") || ec.equals("B"))
	    perf="Excellent";
    }
    void display()
    {
	System.out.println("Name:"+name+" Address:"+address+" DOB:"+dob+" Age:"+age);
	System.out.println("Department:"+dept+" Grade:"+g+" Extra-curricular grade:"+ec+" Performance:"+perf);
    }
}
class Prof extends Person
{
    String dept,perf;
    int np,nf;
    void assign()
    {	
	Scanner in=new Scanner(System.in);
        super.assign();
	System.out.println("Enter the department, no. of publications & no. of funded projects");
   	dept=in.next();
	np=in.nextInt();
	nf=in.nextInt();
    }
    void calc_perf()
    {
	if(np>10 && nf>4)
	    perf="Outstanding";
	else if(np>6 && nf>2)
	    perf="Excellent";
	else if(np>4 && nf>1)
	    perf="Good";
	else if(np>2 && nf==0)
	    perf="Fair";
    }
    void display()
    {
	System.out.println("Name:"+name+" Address:"+address+" DOB:"+dob+" Age:"+age);
	System.out.println("Department:"+dept+" Publications:"+np+" Projects:"+nf+" Performance:"+perf);
    }
}
class StuInher
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the no. of people");
	int n=in.nextInt();
	Person[] p = new Person[n];
	String role;
	for(int i=0;i<n;i++)
	{
	    System.out.println("Enter the role");
	    role=in.next();
	    if(role.equals("Student"))
	    {
		p[i]=new Student();
		p[i].assign();
		p[i].calc_perf();
		p[i].display();
	    }
	    else if(role.equals("Professor"))
	    {
		p[i]=new Prof();
		p[i].assign();
		p[i].calc_perf();
		p[i].display();
	    }
	}
    }
}
