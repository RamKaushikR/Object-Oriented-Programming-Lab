package shape;
import java.lang.Math;
public class Triangle
{
    public double area(double a, double b, double c, double s)
    {
	return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double peri(double a, double b, double c)
    {
	return a+b+c;
    }
}
