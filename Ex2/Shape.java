import shape.Square;
import shape.Circle;
import shape.Triangle;
import java.util.Scanner;
class Shape
{
    public static void main(String[] args)
    {
	Square s=new Square();
	Triangle t=new Triangle();
	Circle c=new Circle();
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the choice S,T or C");
	String ch=in.next();
	double ar,pe;
	switch(ch)
	{
	    case "S":
		System.out.println("Enter the side");
		double a=in.nextDouble();
	        ar=s.area(a);
		pe=s.peri(a);
		System.out.println("Perimeter="+pe+" Area="+ar);
		break;
	    case "T":
		System.out.println("Enter the sides");
		double p,b,q;
		p=in.nextDouble();
		b=in.nextDouble();
		q=in.nextDouble();
		pe=t.peri(p,b,q);
		ar=t.area(p,b,q,pe);
		System.out.println("Perimeter="+pe+" Area="+ar);
		break;
            case "C":
		System.out.println("Enter the radius");
		double r=in.nextDouble();
	        ar=c.area(r);
		pe=c.peri(r);
		System.out.println("Perimeter="+pe+" Area="+ar);
		break;
	    default:
		System.out.println("Invalid choice");
		break;
	}
    }
}
