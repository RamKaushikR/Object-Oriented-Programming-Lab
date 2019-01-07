import java.util.Scanner;
class Box
{
    double l,w,d;
}
class BoxWeight extends Box
{
    double wt;
}
class BoxShipment extends BoxWeight
{
    double cost;
    Scanner in=new Scanner(System.in);
    void getinput()
    {
	System.out.println("Enter the dimensions");
	l=in.nextDouble();
	w=in.nextDouble();
	d=in.nextDouble();
	System.out.println("Enter the weight");
	wt=in.nextDouble();
    }
    void cost()
    {
	cost=(5*l*w*d)+(3*wt);
	System.out.println("Volume:"+(l*w*d)+"m^3 Weight:"+wt+"kg Cost:Rs"+cost);
    }
}
class BoxInher
{
    public static void main(String[] args)
    {
	BoxShipment b=new BoxShipment();
	b.getinput();
	b.cost();
    }
}
