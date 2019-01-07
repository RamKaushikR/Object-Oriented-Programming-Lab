import java.util.Scanner;
abstract class Shape
{
    int l,b;
    void print_area()
    {
	;
    }
}
class Rectangle extends Shape
{
    void print_area()
    {
	Scanner in = new Scanner(System.in);
	l=in.nextInt();
	b=in.nextInt();
	double a=(double)l*b;
	System.out.println(a);
    }
}
class Triangle extends Shape
{
    void print_area()
    {
	Scanner in = new Scanner(System.in);
	l=in.nextInt();
	b=in.nextInt();
	double a=(double)l*b;
	a=a/2.0;
	System.out.println(a);
    }
}
class Circle extends Shape
{
    void print_area()
    {
	Scanner in = new Scanner(System.in);
	l=in.nextInt();
	b=in.nextInt();
	double a=(double)3.14*l*b;
	System.out.println(a);
    }
}
class Abstract
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	String choice=in.next();
	if(choice.equals("Rectangle"))
	{
	    Rectangle r = new Rectangle();
	    r.print_area();
	}
	else if(choice.equals("Triangle"))
	{
	    Triangle t = new Triangle();
	    t.print_area();
	}
	else if(choice.equals("Circle"))
	{
	    Circle c = new Circle();
	    c.print_area();
	}
    }
}
