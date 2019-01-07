import java.util.Scanner;
class Stu
{
    int id;
    String name,dept;
    float avg;
    int[] mark = new int[3];
    void assign(int id, int[] mark, String name, String dept)
    {
	int s=0;
	this.id=id;
	for(int i=0;i<3;i++)
	{
	    this.mark[i]=mark[i];
	    s+=mark[i];
	}
	this.name=name;
	this.dept=dept;
	avg=(float) s/3;
    }
    boolean search(int id)
    {
	if(this.id==id)
	    return true;
	return false;
    }
    void display()
    {
	System.out.println(id+" "+name+" "+dept);
	System.out.println(mark[0]+" "+mark[1]+" "+mark[2]+" "+avg);
    }
}
class Student
{
    static int id,mark[];
    static String name,dept;
    public static void main(String[] args)
    {
	Scanner in=new Scanner(System.in);
	Stu[] s;
	int n;
	System.out.println("Enter no. of students");
	n=in.nextInt();
	s=new Stu[n];
	for(int i=0;i<n;i++)
	{
	    System.out.println("Enter the id");
	    s[i]=new Stu();
	    id=in.nextInt();
	    mark=new int[3];
	    System.out.println("Enter the name");
	    name=in.next();
	    System.out.println("Enter the department");
	    dept=in.next();
	    System.out.println("Enter the marks");
	    for(int j=0;j<3;j++)
		mark[j]=in.nextInt();
	    s[i].assign(id,mark,name,dept);
	    int q;
	    System.out.println("Enter id to search");
	    q=in.nextInt();
	    boolean ins;
	    ins=s[i].search(q);
	    s[i].display();
	    System.out.println(ins);
	}
    }
}
	    
